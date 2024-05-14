package com.ogiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args){
        /*
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * '++' : 1의 증가를 의미한다.
        * '--' : 1의 감소를 의미한다.
        * ++X ㅣㅣ X++ (앞에 쓰면 먼저 1을 더한다./ 뒤에 쓰면 앞의 값을 먼저 계산한 후 1을 더한다.)
        * */

        int num = 0;
        int x = ++num;
        System.out.println(x);

        int num1 = 0;
        int x1 = 10 + (++num1);
        System.out.println(x1);
        System.out.println(num1);

        num1 = 0;
        x1 = 10 + num1++;
        System.out.println(x1);
        System.out.println(num1);

        num = 0;
        int result = num++ *10;
        System.out.println(result);

        result = ++num * 10;
        System.out.println(result);








    }
}
