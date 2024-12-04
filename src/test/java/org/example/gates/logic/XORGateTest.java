package org.example.gates.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XORGateTest {
    @Test
    public void testXORGate() {
        XORGate xorGate = new XORGate();
        assertFalse(xorGate.execute(false, false));
        assertTrue(xorGate.execute(false, true));
        assertTrue(xorGate.execute(true, false));
        assertFalse(xorGate.execute(true, true));
    }
}
