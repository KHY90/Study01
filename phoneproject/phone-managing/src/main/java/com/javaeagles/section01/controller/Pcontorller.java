package main.java.com.javaeagles.section01.controller;

import main.java.com.javaeagles.section01.dto.PhoneDTO;
import main.java.com.javaeagles.section01.service.Pservice;

import java.util.ArrayList;

public class Pcontorller {
    // 필수 값 누락되지는 확인해줭

    // contorller -> service 넘겨줭

    // 필수 값 누락되는지 확인하는 전화번호 등록하는 메소드 하나

    // 필수 값 누락되는지 확인하는 전화번호 수정하는 메소드 하나

    // 필수 값 누락되는지 확인하는 전화번호 삭제하는 메소드 하나

    private final Pservice pservice = new Pservice();

    public String info(PhoneDTO[] infos){ // 등록

        for(PhoneDTO phoneDTO : infos) {

            if (phoneDTO.getName().equals("")) {
                return "이름을 입력해주세요.";
            }
            if (phoneDTO.getPhone().equals("")) {
                return "번호를 입력해주세요.";
            }
            if (phoneDTO.getEmail().equals("")) {
                return "메일을 입력해주세요.";
            }
            if (phoneDTO.getMemo().equals("")) {
                return "메모을 입력해주세요.";
            }
            if (phoneDTO.getGroup().equals("")) {
                return "그룹을 입력해주세요.";
            }

        }
            String result = pservice.info(infos);
            return result;
    }

    public String phoneDelete(int nik){ // 삭제
        String result = pservice.phoneDelete(nik);
        return result;
    }

    public String phoneDetail(int serch){ //상세조회

        if(serch < 0){
            return "없는 분입니다.";
        }
        PhoneDTO phoneDTO = pservice.phoneDetail(serch);
        if(phoneDTO == null){
            return "존재하지 않는 번호입니다.";
        }
        return phoneDTO.toString();
    }


    public String phoneAllInfo(){ // 전체조회
        ArrayList phoneallinfo = pservice.phoneAllInfo();
        String result = "조회 목록 : " + phoneallinfo.toString();
        return result;
    }
}
