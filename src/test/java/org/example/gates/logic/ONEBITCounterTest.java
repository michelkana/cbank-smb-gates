package org.example.gates.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ONEBITCounterTest {
    @Test
    public void testONEBITCounter() {
        ONEBITCounter onebitCounter = new ONEBITCounter();
        onebitCounter.setStoredValue(false);
        assertFalse(onebitCounter.execute(false, false));
        assertTrue(onebitCounter.execute(false, true));
        assertFalse(onebitCounter.execute(true, false));
        assertTrue(onebitCounter.execute(true, true));
    }
}
