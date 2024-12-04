package org.example.gates.logic;

import org.example.gates.Gate;

public class XORGate extends Gate {
    private final Gate nandGate = new NANDGate();
    private final Gate andGate = new ANDGate();
    private final Gate orGate = new ORGate();

    @Override
    public boolean execute(boolean inputA, boolean inputB) {
        return orGate.execute(andGate.execute(inputA, nandGate.execute(inputA, inputB)),
                andGate.execute(inputB, nandGate.execute(inputA, inputB)));
    }
}