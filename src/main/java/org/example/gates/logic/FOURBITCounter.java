package org.example.gates.logic;

import org.example.gates.Gate;

public class FOURBITCounter {
    private ONEBITCounter[] oneBitCounters = {new ONEBITCounter(), new ONEBITCounter(), new ONEBITCounter(), new ONEBITCounter()};

    public int count(boolean clock, boolean data) {
        String binaryValue = "";
        boolean output;
        for (ONEBITCounter oneBitCounter : oneBitCounters){
            output = oneBitCounter.execute(clock, data);
            clock = output;
            binaryValue += (output ? "1" : "0");
        }
        int intValue = Integer.parseInt(binaryValue, 2);
        return intValue;
    }

}
