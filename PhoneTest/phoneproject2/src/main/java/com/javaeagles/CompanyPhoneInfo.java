package com.javaeagles;

public class CompanyPhoneInfo extends PhoneInfo {

    private String company;

    public CompanyPhoneInfo(String name, String phone, String company) {
        super(name, phone);
        this.company = company;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("회사 : "+company);
    }

}
