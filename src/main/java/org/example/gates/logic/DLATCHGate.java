package org.example.gates.logic;

import org.example.gates.Gate;

public class DLATCHGate extends Gate {
    private Gate nandGate = new NANDGate();
    private boolean storedValue = true;

    @Override
    public boolean execute(boolean enable, boolean data) {
        boolean outputA;
        boolean outputB;
        boolean outputC;
        boolean outputD;
        outputA = nandGate.execute(data, enable);
        outputB = nandGate.execute(outputA, enable);

        if (enable){
            if (outputB == false){
                outputD = true;
                outputC = false;
            }else{
                outputC = true;
                outputD = false;
            }
            setStoredValue(outputC);
        }else{
            outputC = storedValue;
            outputD = !storedValue;
        }
        return outputC;
    }

    public boolean getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(boolean storedValue) {
        this.storedValue = storedValue;
    }
}
