package org.example.gates.logic;

import org.example.gates.Gate;

public class ONEBITCounter extends Gate {
    private FLIPFLOPGate flipflopGate = new FLIPFLOPGate();
    private boolean storedValue = true;

    @Override
    public boolean execute(boolean clock, boolean data) {
        boolean output = flipflopGate.execute(clock, storedValue);
        setStoredValue(!output);
        return output;
    }

    public boolean getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(boolean storedValue) {
        this.storedValue = storedValue;
        flipflopGate.setStoredValue(storedValue, storedValue);
    }


}
