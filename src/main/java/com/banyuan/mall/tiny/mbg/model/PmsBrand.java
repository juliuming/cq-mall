/*
*
* PmsBrand.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-03-05
*/
package com.banyuan.mall.tiny.mbg.model;

import java.io.Serializable;

public class PmsBrand implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 首字母
     */
    private String firstLetter;

    /**
     * 
     */
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    private Integer factoryStatus;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 产品数量
     */
    private Integer productCount;

    /**
     * 产品评论数量
     */
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    private String logo;

    /**
     * 专区大图
     */
    private String bigPic;

    /**
     * 品牌故事
     */
    private String brandStory;

    /**
     * pms_brand
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 首字母
     * @return first_letter 首字母
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * 首字母
     * @param firstLetter 首字母
     */
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    /**
     * 
     * @return sort 
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 
     * @param sort 
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 是否为品牌制造商：0->不是；1->是
     * @return factory_status 是否为品牌制造商：0->不是；1->是
     */
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * 是否为品牌制造商：0->不是；1->是
     * @param factoryStatus 是否为品牌制造商：0->不是；1->是
     */
    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    /**
     * 
     * @return show_status 
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 
     * @param showStatus 
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 产品数量
     * @return product_count 产品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 产品数量
     * @param productCount 产品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 产品评论数量
     * @return product_comment_count 产品评论数量
     */
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    /**
     * 产品评论数量
     * @param productCommentCount 产品评论数量
     */
    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    /**
     * 品牌logo
     * @return logo 品牌logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 品牌logo
     * @param logo 品牌logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 专区大图
     * @return big_pic 专区大图
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * 专区大图
     * @param bigPic 专区大图
     */
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    /**
     * 品牌故事
     * @return brand_story 品牌故事
     */
    public String getBrandStory() {
        return brandStory;
    }

    /**
     * 品牌故事
     * @param brandStory 品牌故事
     */
    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    /**
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", sort=").append(sort);
        sb.append(", factoryStatus=").append(factoryStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productCount=").append(productCount);
        sb.append(", productCommentCount=").append(productCommentCount);
        sb.append(", logo=").append(logo);
        sb.append(", bigPic=").append(bigPic);
        sb.append(", brandStory=").append(brandStory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}