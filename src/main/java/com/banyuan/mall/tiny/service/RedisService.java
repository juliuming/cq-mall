package com.banyuan.mall.tiny.service;


public interface RedisService {
    void set(String key, String value);

    String get(String key);

    Boolean expire(String key, Long expire);

    void remove(String key);

    Long increment(String key, Long delta);
}
