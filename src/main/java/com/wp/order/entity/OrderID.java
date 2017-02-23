package com.wp.order.entity;

import java.util.Date;

public class OrderID {
    private Integer id;

    private Date time;

    private String stat;

    private Integer money;

    private String seat;

    public OrderID(Integer id, Date time, String stat, Integer money, String seat) {
        this.id = id;
        this.time = time;
        this.stat = stat;
        this.money = money;
        this.seat = seat;
    }

    public OrderID() {
        super();
    }

    public Integer getId() {
        return id;
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }
}