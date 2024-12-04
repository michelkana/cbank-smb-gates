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
        //System.out.println("NAND Gate A with data = " + data + " | enable = " + enable);
        outputA = nandGate.execute(data, enable);
        //System.out.println("NAND Gate B with data = " + outputA + " | enable = " + enable);
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
            //System.out.println("Stored value = " + storedValue);
        }
        /*System.out.println("NAND Gate C with data = " + outputA + " | enable = " + !storedValue);
        outputC = nandGate.execute(outputA,  !storedValue);
        System.out.println("NAND Gate A with data = " + storedValue + " | enable = " + outputB);
        outputD = nandGate.execute(outputC,  outputB);
        System.out.println("NAND Gates results outputA  = " + outputA + " | outputB = " + outputB + " | outputC  = " + outputC + " | outputD = " + outputD);
        setStoredValue(outputC);*/
        return outputC;
    }

    public boolean getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(boolean storedValue) {
        this.storedValue = storedValue;
    }
}
