package com.chrisvasqm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void secondTest() {
        System.out.println("Test 2");
        assertEquals(2, 3);
    }

}
