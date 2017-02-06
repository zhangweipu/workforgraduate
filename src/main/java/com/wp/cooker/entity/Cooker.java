package com.wp.cooker.entity;

import java.util.Date;

/**
 * Created by admin on 2016/10/24.
 */
public class Cooker {
    private String id;
    private String name;
    private Date  startWork;//开始工作时间
    private String dengji;//厨师等级
    private Integer score;//厨师每的多少分长等级
    private String detial;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartWork() {
        return startWork;
    }

    public void setStartWork(Date startWork) {
        this.startWork = startWork;
    }

    public String getDengji() {
        return dengji;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDetial() {
        return detial;
    }

    public void setDetial(String detial) {
        this.detial = detial;
    }

    @Override
    public String toString() {
        return "Cooker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startWork=" + startWork +
                ", dengji='" + dengji + '\'' +
                ", score=" + score +
                ", detial='" + detial + '\'' +
                '}';
    }
}
