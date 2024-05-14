package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.Prepository;
import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.ArrayList;

public class Pservice {
    private Prepository prepository = new Prepository();

    public String pInfo(PhoneDTO[] phones) {
        String result = Prepository.pInfo(phones);
        return result;
    }

    public String infoDelete(int no) {
        String result = prepository.infoDelete(no);
        return result;
    }

    public ArrayList infoRead() {
        ArrayList nameList = prepository.infoRead();
        return nameList;
    }

    public PhoneDTO infoDetail(int num) {
        PhoneDTO phoneDTO = prepository.infoDetail(num);
        return phoneDTO;
    }
}
