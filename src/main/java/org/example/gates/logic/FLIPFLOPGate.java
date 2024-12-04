package org.example.gates.logic;

import org.example.gates.Gate;

public class FLIPFLOPGate extends Gate {
    private DLATCHGate dlatchGate1 = new DLATCHGate();
    private DLATCHGate dlatchGate2 = new DLATCHGate();

    @Override
    public boolean execute(boolean data, boolean clock) {
        boolean outputA = dlatchGate1.execute(clock, data);
        boolean outputB = dlatchGate2.execute(!clock, outputA);
        setStoredValue(outputA, outputB);
        return outputB;
    }

    public boolean getStoredValue1() {
        return dlatchGate1.getStoredValue();
    }
    public boolean getStoredValue2() {
        return dlatchGate2.getStoredValue();
    }

    public void setStoredValue(boolean storedValue1, boolean storedValue2) {
        dlatchGate1.setStoredValue(storedValue1);
        dlatchGate2.setStoredValue(storedValue2);
    }

}
