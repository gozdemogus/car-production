package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HatchbackTest {

    @Test
    public void testHatchback() {
        Hatchback hatchback = new Hatchback();
        assertEquals("Hatchback", hatchback.getType());
    }

}
