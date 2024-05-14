package main.java.com.javaeagles.section01.service;

import main.java.com.javaeagles.section01.dao.Prepository;
import main.java.com.javaeagles.section01.dto.PhoneDTO;

import java.util.ArrayList;

public class Pservice {

    // 컨트롤이랑 파인더 받은 데이터를 관리
    // 로직 수행 및 데이터 베이스에 대한 리소스를 관리
    // 등록일 경우 등록해주기
    // 수정일 경우 수정해주기
    // 삭제일 경우 삭제해주기
    // 전체조회
    // 상세조회
    // 레파지토리로 넘겨주기

    private final Prepository prepository = new Prepository();

    public String info(PhoneDTO[] infos){ // 등록

        for(PhoneDTO info : infos){
            if(info.getPhone() == null)
                return "다시 입력해주세요.";
        }

        String result = Prepository.info(infos);
        return result;
    }

    public String phoneDelete(int no){ // 삭제
        String result = prepository.phoneDelete(no);
        return result;
    }

    public PhoneDTO phoneDetail(int serch){ // 상세조회
        PhoneDTO result = prepository.phoneDetail(serch);
        return result;
    }

    public ArrayList phoneAllInfo(){
        ArrayList result = prepository.phoneAllInfo();
        return result;
    }

}
