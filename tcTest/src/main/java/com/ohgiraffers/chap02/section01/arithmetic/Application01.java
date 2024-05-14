package com.ohgiraffers.chap02.section01.arithmetic;

public class Application01 {
        public static void main(String[] args) {

            int x = 24;
            int y = 37;

            Application01 app01 = new Application01();
            int result1 = app01.plus(x, y);
            System.out.println(result1);
            int result2 = app01.minus(x, y);
            System.out.println(result2);
            long result3 = app01.multiply(x,y);
            System.out.println(result3);
            double result4 = app01.divide(x,y);
            System.out.println(result4);
        }
        // x, y를 더하는 기능을 만들고 결과를 반환해주세요
        // 1. x,y int 초기화 2. x, y 더하기 함수 3. 반환
        public int plus ( int x, int y){
            int result1 = (x + y);
            return result1;
        }

        // x,y를 빼는 기능을 만들고 결과를 반환해주세요
        public int minus ( int x, int y){
            int result2 = x - y;
            return result2;
        }

        // x,y를 곱하는 기능을 만들고 결과를 반환해주세요
        public long multiply ( int x, int y){
            int result3 = x * y;
            return result3;
        }
        // x, y를 나누고 결과를 반환해주세요

        public double divide ( int x, int y){
            double result4 = (double) x / y;
            return result4;
        }
}

