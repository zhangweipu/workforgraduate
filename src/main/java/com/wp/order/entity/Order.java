package com.wp.order.entity;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer foodID;

    private String foodName;

    private String foodType;

    private Integer foodSize;

    private Integer num;

    private Date time;

    private String la;

    private Integer foodPrice;

    private Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getfoodID() {
        return foodID;
    }

    public void setfoodID(Integer foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Integer getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(Integer foodSize) {
        this.foodSize = foodSize;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Order(){}

    public Order(Integer id, Integer foodID, String foodName, String foodType, Integer foodSize, Integer num, Date time, String la, Integer foodPrice, Integer orderId) {
        this.id = id;
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodSize = foodSize;
        this.num = num;
        this.time = time;
        this.la = la;
        this.foodPrice = foodPrice;
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", foodID=" + foodID +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodSize=" + foodSize +
                ", num=" + num +
                ", time=" + time +
                ", la='" + la + '\'' +
                ", foodPrice=" + foodPrice +
                ", orderId=" + orderId +
                '}';
    }
}