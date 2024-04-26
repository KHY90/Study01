package main.java.com.javaeagles.section01.phoneDB;

import main.java.com.javaeagles.section01.dto.PhoneDTO;

import java.util.ArrayList;

public class PhoneDB {

    private final ArrayList phones;
    public static PhoneDB phoneDB = new PhoneDB();

    private PhoneDB(){
        phones = new ArrayList();
        PhoneDTO phoneDTO = new PhoneDTO("이름","010-1234-5678","group","memo","e-mail");
        phones.add(phoneDTO);
    }

    public static PhoneDB getInstance(){
        return phoneDB;
    }

    public void setInfo(PhoneDTO phoneDTO){
        phones.add(phoneDTO);
    }

    public ArrayList getPhones() {
        return phones;
    }

}
