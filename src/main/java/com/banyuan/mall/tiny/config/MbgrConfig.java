package com.banyuan.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.banyuan.mall.tiny.mbg.mapper","com.banyuan.mall.tiny.dao"})
public class MbgrConfig {
}
