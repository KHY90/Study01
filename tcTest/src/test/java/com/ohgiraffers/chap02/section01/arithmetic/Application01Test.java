package com.ohgiraffers.chap02.section01.arithmetic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Application01Test {

    public static Application01 app1;

    @BeforeAll
    static void constructor(){
        app1 = new Application01();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 30",
            "15, 25, 40",
            "30, 40, 70"
    })
    @DisplayName("더하기 테스트")
    public void plusTest(int x , int y, int result){
        int value = app1.plus(x, y);
        Assertions.assertEquals(result, value);
    }



    @ParameterizedTest
    @CsvSource({
            "10, 20, -10",
            "15, 25, -10",
            "30, 40, -10"
    })
    @DisplayName("마이너스 테스트")
    public void minusTest(int x , int y, int result){
        int value = app1.minus(x, y);
        Assertions.assertEquals(result, value);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 200",
            "15, 25, 375",
            "30, 40, 1200"
    })
    @DisplayName("곱하기 테스트")
    public void multiplyTest(int x , int y, int result){
        Long value = app1.multiply(x, y);
        Assertions.assertEquals(result, value);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 0.5",
            "15, 25, 0.6",
            "30, 40, 0.75"
    })
    @DisplayName("나누기 테스트")
    public void divideTest(int x , int y, double result){
        double value = app1.divide(x, y);
        Assertions.assertEquals(result, value);
    }
}