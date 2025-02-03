package com.app.demo;

public class Challenge {
    private int id;
    private String month;
    private String description;

    public Challenge(int id, String month, String description) {
        this.id = id;
        this.month = month;
        this.description = description;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
