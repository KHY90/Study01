package com.ohgiraffers.chap01.section01.literal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Application01Test {

    @Test
    @DisplayName("literal 테스트")
    void literal(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        PrintStream originalOut = System.out;
        System.setOut(printStream);

        Application01.main(new String[] {});
        System.setOut(originalOut);


        String capturedOutput = outputStream.toString().trim();
        Assertions.assertEquals("즐거운 자바", capturedOutput);


    }
}