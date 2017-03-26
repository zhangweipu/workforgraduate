package com.wp.restuarant.food.entity;

public class Foods {
    private Integer id;

    private String name;

    private String imageName;

    private String type;

    private Integer size;

    private Integer price;

    private String la;

    private String detail;

    public Foods(Integer id, String name, String imageName, String type, Integer size, Integer price, String la, String detail) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
        this.type = type;
        this.size = size;
        this.price = price;
        this.la = la;
        this.detail = detail;
    }

    public Foods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la == null ? null : la.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}