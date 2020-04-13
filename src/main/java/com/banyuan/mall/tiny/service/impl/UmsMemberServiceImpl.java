package com.banyuan.mall.tiny.service.impl;

import com.banyuan.mall.tiny.common.api.CommonResult;
import com.banyuan.mall.tiny.service.RedisService;
import com.banyuan.mall.tiny.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    private RedisService redisService;

    @Value("${redis.key.prefix.telAuth}")
    private String prefix;

    public UmsMemberServiceImpl() {
    }

    ;

    @Autowired
    public UmsMemberServiceImpl(RedisService redisService) {
        this.redisService = redisService;
    }

    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder authCode = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            authCode.append(random.nextInt(10));
        }
        String authCodeResult = authCode.toString();
        redisService.set(prefix + telephone, authCodeResult);
        redisService.expire(prefix + telephone, 3000L);
        return CommonResult.success(authCodeResult, "Succeed get AuthCode");
    }

    @Override
    public CommonResult verifyAuthCode(String telephone, String authcode) {
        try {
            boolean isTrue = redisService.get(prefix+telephone).equals(authcode);
            if (isTrue) {
                return CommonResult.success(isTrue, "操作成功");
            } else {
                return CommonResult.success(isTrue, "操作失败");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return CommonResult.failed(e.toString());
        }
    }
}
