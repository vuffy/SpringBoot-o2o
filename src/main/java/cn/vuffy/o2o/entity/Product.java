package cn.vuffy.o2o.entity;

import java.util.Date;
import java.util.List;

public class Product {

    private Long productId;

    private String productName;

    private String productDesc;

    // 简略图
    private String imgAddr;

    private String normalPrice;

    private String promotionPrice;

    private Integer priority;

    // 购买该商品后，可以获得的积分
    private Integer point;

    private Date createTime;

    private Date lastEditTime;

    // 0-下架 1-前端展示
    private Integer enableStatus;

    private List<cn.vuffy.o2o.entity.ProductImg> productImgList;

    private ProductCategory productCategory;

    private cn.vuffy.o2o.entity.Shop shop;

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<cn.vuffy.o2o.entity.ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<cn.vuffy.o2o.entity.ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public cn.vuffy.o2o.entity.Shop getShop() {
        return shop;
    }

    public void setShop(cn.vuffy.o2o.entity.Shop shop) {
        this.shop = shop;
    }
}
