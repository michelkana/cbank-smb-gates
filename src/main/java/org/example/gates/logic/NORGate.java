package org.example.gates.logic;

import org.example.gates.Gate;

public class NORGate extends Gate {
    private final Gate nandGate = new NANDGate();

    @Override
    public boolean execute(boolean inputA, boolean inputB) {
        boolean tmp = nandGate.execute(nandGate.execute(inputA, inputA), nandGate.execute(inputB, inputB));
        return nandGate.execute(tmp, tmp);
    }
}
