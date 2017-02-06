package com.wp.order.entity;

import java.util.Date;

public class Order {
    private Integer id;

    private String seatMark;

    private String foodName;

    private String foodType;

    private Integer foodSize;

    private Integer foodStutas;

    private Date time;

    private String la;

    private Integer foodPrice;

    public Order(Integer id, String seatMark, String foodName, String foodType, Integer foodSize, Integer foodStutas, Date time, String la, Integer foodPrice) {
        this.id = id;
        this.seatMark = seatMark;
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodSize = foodSize;
        this.foodStutas = foodStutas;
        this.time = time;
        this.la = la;
        this.foodPrice = foodPrice;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeatMark() {
        return seatMark;
    }

    public void setSeatMark(String seatMark) {
        this.seatMark = seatMark == null ? null : seatMark.trim();
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType == null ? null : foodType.trim();
    }

    public Integer getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(Integer foodSize) {
        this.foodSize = foodSize;
    }

    public Integer getFoodStutas() {
        return foodStutas;
    }

    public void setFoodStutas(Integer foodStutas) {
        this.foodStutas = foodStutas;
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
        this.la = la == null ? null : la.trim();
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }
}