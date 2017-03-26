package com.wp.restuarant.service.entity;

/**
 * Created by admin on 2016/11/27.
 */
public class Table {
    private String index;
    private String name;
    private String imageName;
    private String type;
    private String price;
    private String size;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Table{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", imageName='" + imageName + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
