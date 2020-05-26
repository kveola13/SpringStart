package com.kveola13.pojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void testAttack() {
        Unit unit = new Unit(1, "Murloc", 3, 1, new Race("Tauren", 101));
        assertEquals(3, unit.getAttack());
    }
}