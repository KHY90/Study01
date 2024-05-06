package com.ohgiraffers.order.dao;

import com.ohgiraffers.fakeDB.PhoneDB;
import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.ArrayList;

public class Prepository {
    private static final PhoneDB phoneDB = PhoneDB.getInstance();

    public static String pInfo(PhoneDTO[] phones) {
        int oldNum = phoneDB.getPhones().size();

        for (PhoneDTO phoneDTO : phones) {
            phoneDB.setItem(phoneDTO);
        }
        if(oldNum >= phoneDB.getPhones().size()){
            return "등록실패";
        }

        return "등록성공";

    }

    public ArrayList infoRead() {
        String text = phoneDB.getPhones().toString();
        System.out.println("~~~~~~~~");
        System.out.println(phoneDB.getPhones().toString());

        System.out.println("~~~~~~~~");
        return phoneDB.getPhones();
    }

    public PhoneDTO infoDetail(int num) {
        PhoneDTO phoneDTO = (PhoneDTO) phoneDB.getPhones().get(num);
        return phoneDTO;
    }

    public String infoDelete(int no) {
        int oldSize = phoneDB.getPhones().size();
        phoneDB.getPhones().remove(no);
        if(phoneDB.getPhones().size() >= oldSize){
            return "등록 취소가 실패하였습니다.";
        }
        return "등록이 취소되었습니다.";
    }

    public void setItem(PhoneDTO phoneDTO) {
        int modifyNo = phoneDB.getPhones().indexOf(phoneDTO);
        if(modifyNo != -1){
            phoneDB.getPhones().set(modifyNo, phoneDTO);
        }
    }
}
