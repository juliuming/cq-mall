/*
*
* PmsBrandMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-03-05
*/
package com.banyuan.mall.tiny.mbg.mapper;

import com.banyuan.mall.tiny.mbg.model.PmsBrand;
import com.banyuan.mall.tiny.mbg.model.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@SuppressWarnings("all")
@Repository
public interface PmsBrandMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(PmsBrandExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(PmsBrandExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(PmsBrand record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(PmsBrand record);

    /**
     *
     * @mbggenerated
     */
    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    /**
     *
     * @mbggenerated
     */
    List<PmsBrand> selectByExample(PmsBrandExample example);

    /**
     *
     * @mbggenerated
     */
    PmsBrand selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PmsBrand record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PmsBrand record);
}