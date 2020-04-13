package com.banyuan.mall.tiny.controller;

import com.banyuan.mall.tiny.common.api.CommonResult;
import com.banyuan.mall.tiny.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = "UmsMemberController")
@Controller
@RequestMapping("/umsMember")
public class UmsMemberController{
    private UmsMemberService umsMemberService;
    public UmsMemberController(){}
    @Autowired
    public UmsMemberController(UmsMemberService umsMemberService){
        this.umsMemberService = umsMemberService;
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult generatorAuthCode(@RequestParam("telephone") String telephone){
        return umsMemberService.generateAuthCode(telephone);
    }

    @ApiOperation("验证验证码")
    @RequestMapping(value = "/verifyAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult verifyAuthCode(@RequestParam String telephone,@RequestParam String authCode){
       return umsMemberService.verifyAuthCode(telephone,authCode);
    }
}
