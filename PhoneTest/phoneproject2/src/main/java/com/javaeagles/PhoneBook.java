package com.javaeagles;

public class PhoneBook {

    private static PhoneBook pb;
    private PhoneInfo info;
    private PhoneInfo[] infoArr;

    private int cnt, idx;
    private boolean result;

    PhoneBook(int size) {
        infoArr = new PhoneInfo[size];
    }

    public static PhoneBook getPhoneBook(int size) {
        if(pb == null)
            pb = new PhoneBook(size);
        return pb;
    }

    public boolean insert(String name, String phone) {
        if(cnt>=infoArr.length) {
            return false;
        }
        info = new PhoneInfo(name, phone);
        idx = sort();
        infoArr[idx] = info;
        cnt++;
        return true;
    }

    public boolean insert(String name, String phone, String major, int year) {
        if(cnt>=infoArr.length) {
            return false;
        }
        info = new UnivPhoneInfo(name, phone, major, year);
        idx = sort();
        infoArr[idx] = info;
        cnt++;
        return true;
    }

    public boolean insert(String name, String phone, String company) {
        if(cnt>=infoArr.length) {
            return false;
        }
        info = new CompanyPhoneInfo(name, phone, company);
        idx = sort();
        infoArr[idx] = info;
        cnt++;
        return true;
    }

    public int sort() {
        int i;
        for(i=0; i<cnt; i++) {
            if(infoArr[i].getName().compareTo(info.getName())>0) {
                for(int j=cnt-1; j>=i; j--) {
                    infoArr[j+1] = infoArr[j];
                }
                break;
            }
        }
        return i;
    }

    public boolean search(String name) {
        result = false;
        for(int i=0; i<cnt; i++) {
            if(name.equals(infoArr[i].getName())) {
                infoArr[i].printInfo();
                result = true;
            }
        }
        return result;
    }

    public int searchPhone(String phone) {
        for(int i=0; i<cnt; i++) {
            if(phone.equals(infoArr[i].getPhone())) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int idx) {
        for(int i=idx; i<cnt-1; i++) {
            for(int j=i+1; j<cnt; j++) {
                infoArr[i] = infoArr[j];
            }
        }
        infoArr[--cnt] = null;
    }

    public boolean allprint() {

        if(cnt==0) return false;
        for(int i=0; i<cnt; i++) {
            infoArr[i].printInfo();
        }

        return true;

    }
}
