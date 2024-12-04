package org.example.gates.logic;

import org.example.gates.Gate;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NANDGateTest {

    @Test
    public void testNANDGate() {
        Gate nandGate = new NANDGate();
        assertTrue(nandGate.execute(false, false));
        assertTrue(nandGate.execute(false, true));
        assertTrue(nandGate.execute(true, false));
        assertFalse(nandGate.execute(true, true));
    }
}
