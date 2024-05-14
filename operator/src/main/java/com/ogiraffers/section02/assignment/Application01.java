package com.ogiraffers.section02.assignment;

public class Application01 {
    public static void main(String[] args){
        // int인 정수형의 변수를 num1로 선언하고 10의 값을 할당한다.
        int num1 = 10;
        int num2 = 10;
        // num2 라는 변수에 num1과 num2를 더해서 대입한다.
        // num2 = num1 + num2;

        /*
        *  대입연산자와 산술 복합 대입 연산자
        *  '='  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함.
        *  '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
        *  '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
        *  '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
        *  '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
        *  '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
        */
        // num2의 변수에 num1과 num2를 더한 값을 대입해주세요.

        num2 += num1;
        // num2 + num1;
        // num2 = result;
        System.out.println(num2);

        num2 -= num1;
        System.out.println(num2);

        num2 *= num1;
        System.out.println(num2);

        num2 /= num1;
        System.out.println(num2);

        num2 %= num1;
        System.out.println(num2);






    }
}
