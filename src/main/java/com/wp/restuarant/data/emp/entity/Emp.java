package com.wp.restuarant.data.emp.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

public class Emp {

    @NotEmpty
    private Integer id;
    private String name;
    @NumberFormat
    private int age;
    private Integer duty;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date worktime;
    private Integer salary;
    private Integer power;
    private String sex;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public Emp(){}

    public Emp(Integer id, String name, int age, Integer duty, Date worktime, Integer salary, Integer power) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.duty = duty;
        this.worktime = worktime;
        this.salary = salary;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", duty=" + duty +
                ", worktime=" + worktime +
                ", salary=" + salary +
                ", power=" + power +
                ", sex='" + sex + '\'' +
                '}';
    }
}
