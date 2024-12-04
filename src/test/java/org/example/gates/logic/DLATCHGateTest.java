package org.example.gates.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DLATCHGateTest {

    @Test
    public void testDLATCHGate() {
        DLATCHGate dlatchGate = new DLATCHGate();
        dlatchGate.setStoredValue(false);
        //dlatchGate.execute(enable, data)
        assertFalse(dlatchGate.execute(false, false));
        assertFalse(dlatchGate.execute(false, true));
        assertFalse(dlatchGate.execute(true, false));
        assertTrue(dlatchGate.execute(true, true));
    }
}
