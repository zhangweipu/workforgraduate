package com.wp.restuarant.data.finance.entity;

/**
 * Created by zwp on 17-5-9.
 */
public class Account {
    private Integer accountId;
    private Double amount;
    private String type;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccountDao{" +
                "accountId=" + accountId +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
