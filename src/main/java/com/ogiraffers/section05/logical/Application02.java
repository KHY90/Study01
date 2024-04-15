package com.ogiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args){
        /*
        *  논리 연산자의 우선순위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *   논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높다.
        * */

        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100)); //true

        int num2 = 166;
        System.out.println("num2가 1부터 100 사이인지 확인 : " + (num2>=1 && num2<=100)); //false

        char ch1 ='G';
        System.out.println("ch1이 대문자인지 확인하기 : " + (ch1 == 'G')); //true

        char ch2 = 'Y';
        System.out.println("영문자 y인지 확인 : " + ((ch2=='y')||(ch2=='Y'))); //true

        char ch3 = 'y';
        System.out.println("영문자 y인지 확인 : " + ((ch3=='Y')||(ch3=='y'))); //true

        char ch4 = 'f';
        System.out.println("영문자인지 확인 : " + (((ch4 >= 'a')||(ch4 <= 'z'))||((ch4 >= 'A')||(ch4<='Z')))); //true




    }
}
