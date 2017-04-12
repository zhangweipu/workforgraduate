package com.wp.restuarant.data.emp.entity;

import java.util.Date;

/**
 *  id int auto_increment primary key,
 name varchar(20),
 age int,
 duty int,
 worktime date,
 salary int,
 power int
 *
 * Created by zwp on 17-4-12.
 */
public class Emp {

    private Integer id;
    private String name;
    private int age;
    private Integer duty;
    private Date worktime;
    private Integer salary;
    private Integer power;

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
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getDuty() {
        return duty;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Emp(Integer id, String name, int age, Integer duty, Date worktime, Integer salary, Integer power) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.duty = duty;
        this.worktime = worktime;
        this.salary = salary;
        this.power = power;
    }
}
