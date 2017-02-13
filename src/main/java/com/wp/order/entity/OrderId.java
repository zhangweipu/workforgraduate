package com.wp.order.entity;

import java.util.Date;
import java.util.List;

public class OrderId {
    private Integer id;

    private Date time;

    private String stat;

    private Integer money;

    List<Order> orders;


    public OrderId(Integer id, Date time, String stat, Integer money, List<Order> orders) {
        this.id = id;
        this.time = time;
        this.stat = stat;
        this.money = money;
        this.orders = orders;
    }

    public OrderId() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}