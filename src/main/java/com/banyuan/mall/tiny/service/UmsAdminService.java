package com.banyuan.mall.tiny.service;

import com.banyuan.mall.tiny.mbg.model.UmsAdmin;
import com.banyuan.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

public interface UmsAdminService {
    UmsAdmin getUmsAdminByName(String name);
    List<UmsPermission> getPermissionList(Long id);
    String login(String username,String password);
    UmsAdmin register(UmsAdmin umsAdminParam);
}
