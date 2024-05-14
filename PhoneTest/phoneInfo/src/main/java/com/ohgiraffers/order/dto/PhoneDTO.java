package com.ohgiraffers.order.dto;

public class PhoneDTO {
    private String name;
    private String phone;
    private String email;
    private String group;
    private String memo;

    public PhoneDTO(String name, String phone, String email, String group, String memo) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.group = group;
        this.memo = memo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "등록정보{" +
                "이름 ='" + name + '\'' +
                ", 전화번호 ='" + phone + '\'' +
                ", 이메일 ='" + email + '\'' +
                ", 그룹 ='" + group + '\'' +
                ", 메모 ='" + memo + '\'' +
                '}';
    }


}
