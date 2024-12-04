package org.example;
import org.example.gates.logic.*;

public class Main {
    public static void main(String[] args) {

        FOURBITCounter fourbitCounter = new FOURBITCounter();
        System.out.println("Hello and welcome to our strange 4-bit binary counter :-)");
        for (int i = 0; i <= 20; i++) {
            int currentValue = fourbitCounter.count(false, false);
            System.out.println(currentValue);
        }

    }
}