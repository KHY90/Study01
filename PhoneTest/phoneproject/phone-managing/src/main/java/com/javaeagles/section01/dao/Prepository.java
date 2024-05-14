package main.java.com.javaeagles.section01.dao;

import main.java.com.javaeagles.section01.dto.PhoneDTO;
import main.java.com.javaeagles.section01.phoneDB.PhoneDB;

import java.util.ArrayList;

public class Prepository {

    // 모든 값들을 private로 받아서 값 할당해주기
    // 할당 받은 값들을 리턴시켜주기
    // ArraryList 해주면 좋고 아니면 말고 ㅋㅋ

    private final ArrayList infos = new ArrayList();
    private static final PhoneDB phoneDB = PhoneDB.getInstance();

    public static String info(PhoneDTO[] infos){ // 등록

        int oldNum = phoneDB.getPhones().size();

        for(PhoneDTO phoneDTO : infos){
            phoneDB.setInfo(phoneDTO);
        }
        if(oldNum >= phoneDB.getPhones().size()){
            return "등록실패";
        }
        return "등록되었습니다.";
    }

    public String phoneDelete(int nik){ // 삭제

        int oldsize = phoneDB.getPhones().size();
        phoneDB.getPhones().remove(nik);

        if(phoneDB.getPhones().size() >= oldsize){
            return "삭제 실패하였습니다.";
        }
        return "삭제되었습니다.";
    }

    public String phoneMody(int no){ // 수정

        return "수정되었습니다.";
    }

    public PhoneDTO phoneDetail(int serch){ // 상세조회

        PhoneDTO result = (PhoneDTO) infos.get(serch);
        return result;
    }

    public ArrayList phoneAllInfo(){ // 전체조회

        return phoneDB.getPhones();
    }

}
