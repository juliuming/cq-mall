package com.banyuan.mall.tiny.service.impl;


import com.banyuan.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.banyuan.mall.tiny.mbg.model.PmsBrand;
import com.banyuan.mall.tiny.mbg.model.PmsBrandExample;
import com.banyuan.mall.tiny.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    private PmsBrandMapper pmsBrandMapper;

    public PmsBrandServiceImpl(){}
    @Autowired
    public PmsBrandServiceImpl(PmsBrandMapper pmsBrandMapper){
        this.pmsBrandMapper = pmsBrandMapper;
    }

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand pmsBrand) {
        return pmsBrandMapper.insert(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand pmsBrand) {
        pmsBrand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
