package com.banyuan.mall.tiny.service;

import com.banyuan.mall.tiny.common.api.CommonResult;
import org.springframework.stereotype.Service;

@Service
public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone,String authcode);


}
