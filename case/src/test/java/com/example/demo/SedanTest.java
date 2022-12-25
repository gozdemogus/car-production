package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SedanTest {

    @Test
    public void testSedan() {
        Sedan sedan = new Sedan();
        assertEquals("Sedan", sedan.getType());
    }

}
