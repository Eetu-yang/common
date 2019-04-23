package com.single.domain;

/**
 * order info
 */
public class SimpleOrder {

    /**
     * order no
     */
    private String orderNo;

    /**
     * user name
     */
    private String userName;

    /**
     * user phone
     */
    private String mobile;

    /**
     * product name
     */
    private String productName;

    /**
     * apply time
     */
    private String createTime;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SimpleOrder{" +
                "orderNo='" + orderNo + '\'' +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", productName='" + productName + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
