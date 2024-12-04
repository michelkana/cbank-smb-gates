package org.example.gates.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FOURBITCounterTest {
    @Test
    public void testFOURBITCounter() {
        FOURBITCounter fourbitCounter = new FOURBITCounter();
        assertEquals(fourbitCounter.count(false, false), 15);
    }
}
