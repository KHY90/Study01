package com.ohgiraffers.chap01.section02.variable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class Application01Test {

    @Test
    @DisplayName("변수 테스트")
    void variable(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        PrintStream originalOut = System.out;
        System.setOut(printStream);

        Application01.main(new String[] {});
        System.setOut(originalOut);


        String capturedOutput = outputStream.toString().trim();
        Assertions.assertEquals(10, Integer.parseInt(capturedOutput));
    }
}