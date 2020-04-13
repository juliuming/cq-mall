/*
*
* UmsAdminMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-03-10
*/
package com.banyuan.mall.tiny.mbg.mapper;

import com.banyuan.mall.tiny.mbg.model.UmsAdmin;
import com.banyuan.mall.tiny.mbg.model.UmsAdminExample;
import java.util.List;

import com.banyuan.mall.tiny.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsAdminMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UmsAdminExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UmsAdminExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(UmsAdmin record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UmsAdmin record);

    /**
     *
     * @mbggenerated
     */
    List<UmsAdmin> selectByExample(UmsAdminExample example);

    /**
     *
     * @mbggenerated
     */
    UmsAdmin selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UmsAdmin record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UmsAdmin record);

    UmsAdmin selectByUserName(String username);

    List<UmsPermission> selectPermissionListById(Long id);
}