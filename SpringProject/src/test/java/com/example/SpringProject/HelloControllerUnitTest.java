package com.example.SpringProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {

    @Test
    void hello() {
        HelloController helloController = new HelloController();
        String name = "Jamie";
        assertEquals("Hello " + name,helloController.hello(name));
    }

    @Test
    void getReverse() {
        HelloController helloController = new HelloController();
        String word1 = "Sercan";
        String word2  = "TUNA";
        String word3 = "Lokman123";

        assertEquals("nacreS",helloController.getReverse(word1));
        assertEquals("ANUT",helloController.getReverse(word2));
        assertEquals("321namkoL",helloController.getReverse(word3));


    }
}