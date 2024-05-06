package com.javaeagles;

public class MenuChoiceException extends Exception {

    private int wrong;

    public MenuChoiceException(int wrong) {
        super(wrong+"에 해당하는 선택은 존재하지 않습니다.");
        this.wrong = wrong;

    }
}

