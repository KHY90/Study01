package com.ohgiraffers.chap02.section01.comparsion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Application01Test {

    private static Application01 app1;
    @BeforeAll
    static void constructor(){
        app1 = new Application01();
    }


    @ParameterizedTest
    @CsvSource({
            "10, 10, true",
            "10, 20, false"
    })
    @DisplayName("값 비교 테스트")
    public void 조건문(int x, int y, boolean value){
        boolean result = app1.valueCheck(x, y);
        Assertions.assertEquals(value, result);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 10, 0",
            "10, 20, 20",
            "3, 2, 3"
    })
    @DisplayName("삼항 연산자 테스트")
    public void 큰값_찾기(int x, int y, int value){
        int result = app1.maxNumberOf(x, y);
        System.out.println(result);
        Assertions.assertEquals(value, result);
    }

    @ParameterizedTest
    @CsvSource({
            "10, true",
            "100, false",
            "0, true"
    })
    @DisplayName("논리 연산자 테스트")
    public void 사이값_찾기(int x, boolean value){
        boolean result = app1.rangeNum(x);
        Assertions.assertEquals(value, result);
    }
}