package com.wp.restuarant.data.finance.entity;

import java.util.Date;

/**
 * create table t_trans(
 transId int auto_increment primary key,
 time date,
 turnover double,
 detail varchar(200)
 );
 *
 * 支出/收入表
 * Created by zwp on 17-5-9.
 */
public class Trans {
   private Integer transId;
   private String type;
   private  Date time;
   private Double turnover;
   private String detail;

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Trans{" +
                "transId=" + transId +
                ", type=" + type +
                ", time=" + time +
                ", turnover=" + turnover +
                ", detail='" + detail + '\'' +
                '}';
    }
}
