package org.example.gates.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ORGateTest {
    @Test
    public void testORGate() {
        ORGate orGate = new ORGate();
        assertFalse(orGate.execute(false, false));
        assertTrue(orGate.execute(false, true));
        assertTrue(orGate.execute(true, false));
        assertTrue(orGate.execute(true, true));
    }
}
