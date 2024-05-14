package com.javaeagles;

public class PhoneInfo {
    private String name, phone;

    public PhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void printInfo() {
        System.out.println("이름 : "+name);
        System.out.println("전화번호 : "+phone);
    }

}

