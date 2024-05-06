package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dao.Prepository;
import com.ohgiraffers.order.dto.PhoneDTO;
import com.ohgiraffers.order.service.Pservice;

import java.util.ArrayList;

public class Pcontroller {
    private final Pservice pservice = new Pservice();

    public String pInfo(PhoneDTO[] phones) {

        for (PhoneDTO phoneDTO : phones) {
            if(phoneDTO.getName().equals("")){
                return "이름을 입력해주세요";
            }
            if(phoneDTO.getPhone().equals("")){
                return "전화번호를 입력해주세요";
            }
            if(phoneDTO.getEmail().equals("")){
                return "이메일을 입력해주세요";
            }
            if(phoneDTO.getGroup().equals("")){
                return "그룹을 입력해주세요";
            }
            if(phoneDTO.getMemo().equals("")){
                return "메모를 입력해주세요";
            }
        }
        String result = pservice.pInfo(phones);
        return result;
    }

    public String infoModify(int modifyNo, PhoneDTO modifiedPhone) {
        Prepository prepository = new Prepository();

        PhoneDTO phoneDTO = prepository.infoDetail(modifyNo);

        if(phoneDTO == null){
            return "수정할 번호가 존재하지 않습니다.";
        }
        phoneDTO.setName(modifiedPhone.getName());
        phoneDTO.setPhone(modifiedPhone.getPhone());
        phoneDTO.setEmail(modifiedPhone.getEmail());
        phoneDTO.setGroup(modifiedPhone.getGroup());
        phoneDTO.setMemo(modifiedPhone.getMemo());

        prepository.setItem(phoneDTO);

        return "수정이 완료 되었습니다.";
    }

    public String infoDelete(int no) {
        String result = pservice.infoDelete(no);
        return result;
    }

    public String infoRead() {
        ArrayList infoList = pservice.infoRead();
        String result = "등록목록 : " + infoList.toString();
        return result;
    }

    public String infoDetail(int num) {
        if(num < 0){
            return "등록번호를 잘못 입력하였습니다.";
        }
        PhoneDTO phoneDTO = pservice.infoDetail(num);
        if(phoneDTO == null){
            return "존재하지 않는 등록번호입니다.";
        }
        return phoneDTO.toString();

    }
}
