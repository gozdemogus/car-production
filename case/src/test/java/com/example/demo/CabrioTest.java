package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabrioTest {

    @Test
    public void testCabrio() {
        Cabrio cabrio = new Cabrio();
        assertEquals("Cabrio", cabrio.getType());
    }

}
