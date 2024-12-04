package org.example.gates.logic;

import org.example.gates.Gate;

public class ORGate extends Gate {
    private final Gate nandGate = new NANDGate();

    @Override
    public boolean execute(boolean inputA, boolean inputB) {
        return nandGate.execute(nandGate.execute(inputA, inputA), nandGate.execute(inputB, inputB));
    }
}