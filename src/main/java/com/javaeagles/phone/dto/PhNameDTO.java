package com.javaeagles.phone.dto;

public class PhNameDTO {
    private String userName;

    public PhNameDTO(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "PhNameDTO{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
