package com.antonromanov.jdbcspring.DAO;

public class Customer {

    private Integer id;

    private String Name;


    public Customer() {
        this.id = 11;
        Name = "Vasya";
    }

    public Integer getCustId() {
        return id;
    }

    public void setCustId(Integer custId) {
        id = custId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
