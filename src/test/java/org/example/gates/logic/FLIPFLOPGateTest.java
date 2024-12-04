package org.example.gates.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FLIPFLOPGateTest {

    @Test
    public void testFLIPFLOPGate() {
        FLIPFLOPGate flipflopGate = new FLIPFLOPGate();
        flipflopGate.setStoredValue(false, false);
        //flipflopGate.execute(data, clock)
        assertFalse(flipflopGate.execute(false, false));
        assertFalse(flipflopGate.execute(true, false));
        assertFalse(flipflopGate.execute(false, true));
        assertFalse(flipflopGate.execute(true, true));
    }
}
