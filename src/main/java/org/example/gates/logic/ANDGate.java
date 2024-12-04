package org.example.gates.logic;

import org.example.gates.Gate;

public class ANDGate extends Gate {
    private final Gate nandGate = new NANDGate();

    @Override
    public boolean execute(boolean inputA, boolean inputB) {
        return nandGate.execute(nandGate.execute(inputA, inputB), nandGate.execute(inputA, inputB));
    }
}
