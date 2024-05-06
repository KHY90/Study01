package com.ohgiraffers.fakeDB;

import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.ArrayList;

public class PhoneDB {

    private final ArrayList phones;
    private static PhoneDB phoneDB = new PhoneDB();

    private PhoneDB() {
        phones = new ArrayList();

    }

    public static PhoneDB getInstance() {
        return phoneDB;
    }
    public void setItem(PhoneDTO phoneDTO) {
        phones.add(phoneDTO);
    }
    public ArrayList getPhones() {
        return phones;
    }
}
