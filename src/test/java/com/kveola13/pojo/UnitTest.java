package com.kveola13.pojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void testAttack() {
        Unit unit = new Unit(1, "Murloc", 3, 1, new Race("Tauren", 101));
        assertEquals(3, unit.getAttack());
    }

    @Test
    void testRace() {
        Race race = new Race("Murloc", 101);
        assertEquals("Murloc", race.name);
        assertEquals(101, race.UId);
    }

    @Test
    void testInitRace(){
        Race race = new Race("random", 100);
        assertEquals("Race added", race.init());
    }
}