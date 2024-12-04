package org.example.gates.logic;

import org.example.gates.Gate;

public class NANDGate extends Gate {
    @Override
    public boolean execute(boolean inputA, boolean inputB) {
        return !(inputA && inputB);
    }
}
