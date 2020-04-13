package com.banyuan.mall.tiny.controller;

import com.banyuan.mall.tiny.common.api.CommonPage;
import com.banyuan.mall.tiny.common.api.CommonResult;
import com.banyuan.mall.tiny.mbg.model.PmsBrand;
import com.banyuan.mall.tiny.service.PmsBrandService;
import com.github.pagehelper.PageInfo;
import io.micrometer.core.instrument.Tags;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "PmsBrandcontroller")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService brandService;

    /*@Autowired
    public PmsBrandController(PmsBrandService brandService){
        this.brandService = brandService;
    }*/

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @PreAuthorize("hasAuthority('pms:brand:read')")
    @ApiOperation("获取所有商品列表")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    CommonResult<List<PmsBrand>> listAllBrand(){
        return CommonResult.success(brandService.listAllBrand());
    }

    @ApiOperation("创建商品品牌")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    CommonResult createBrand(@RequestBody PmsBrand pmsBrand){
        int count = brandService.createBrand(pmsBrand);
        if(count==1){
            LOGGER.debug("操作成功");
            return CommonResult.success(pmsBrand);
        }else{
            LOGGER.debug("操作失败");
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("更新商品品牌")
    @RequestMapping(value= "/upate/{id}",method = RequestMethod.POST)
    @ResponseBody
    CommonResult updateBrand(@PathVariable Long id,@RequestBody PmsBrand pmsBrand){
        int count = brandService.updateBrand(id,pmsBrand);
        if(count==1){
            LOGGER.debug("操作成功");
            return CommonResult.success(pmsBrand);
        }else{
            LOGGER.debug("操作失败");
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("通过id删除商品品牌")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = brandService.deleteBrand(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("分页获取商品品牌")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<PmsBrand> brandList = brandService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation("通过id获得商品品牌")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(brandService.getBrand(id));
    }
}
