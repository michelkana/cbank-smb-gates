package org.example.gates.logic;

import org.example.gates.Gate;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ANDGateTest {
    @Test
    public void testANDGate(){
        Gate andGate = new ANDGate();
        assertFalse(andGate.execute(false,false));
        assertFalse(andGate.execute(false,true));
        assertFalse(andGate.execute(true,false));
        assertTrue(andGate.execute(true,true));
    }
}
