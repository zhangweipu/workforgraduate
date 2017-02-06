package com.wp.client.entity;

/**
 * Created by admin on 2016/10/16.
 * 接收桌号和菜名的类
 */
public class Str {
    private String tab;

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Str{" +
                "tab='" + tab + '\'' +
                ", str='" + str + '\'' +
                '}';
    }
}
