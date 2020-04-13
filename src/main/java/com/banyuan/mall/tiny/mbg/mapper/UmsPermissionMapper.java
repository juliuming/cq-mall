/*
*
* UmsPermissionMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-03-10
*/
package com.banyuan.mall.tiny.mbg.mapper;

import com.banyuan.mall.tiny.mbg.model.UmsPermission;
import com.banyuan.mall.tiny.mbg.model.UmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPermissionMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UmsPermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UmsPermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(UmsPermission record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UmsPermission record);

    /**
     *
     * @mbggenerated
     */
    List<UmsPermission> selectByExample(UmsPermissionExample example);

    /**
     *
     * @mbggenerated
     */
    UmsPermission selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UmsPermission record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UmsPermission record);
}