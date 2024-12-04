package org.example.gates.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NORGateTest {

    @Test
    public void testNORGate() {
        NORGate norGate = new NORGate();
        assertTrue(norGate.execute(false, false));
        assertFalse(norGate.execute(false, true));
        assertFalse(norGate.execute(true, false));
        assertFalse(norGate.execute(true, true));
    }
}
