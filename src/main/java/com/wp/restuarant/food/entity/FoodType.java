package com.wp.restuarant.food.entity;

/**
 * Created by zhang on 2017/3/26.
 */
public class FoodType {
    private String type;
    private Integer id;

    public FoodType() {
    }

    public FoodType(String type, Integer id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}
