# NAND Gate Simulation Project

This project implements a simulation of digital logic gates for four bit counter. The goal is to demonstrate modularity of the software design.

The code is adapted from the original project by https://github.com/furkanansn/java-nand-gate.git

## Key Classes

- **Gate.java**: Abstract class representing a generic logic gate.
- **NANDGate.java**: Implementation of the NAND gate.
- **ANDGate.java**: Implementation of the AND gate.
- **ORGate.java**: Implementation of the OR gate.
- **NORGate.java**: Implementation of the NOR gate.
- **XORGate.java**: Implementation of the XOR gate.
- **DLATCHGate.java**: Implementation of the Gated D Latch.
- **FLIPFLOPGate.java**: Implementation of the Master-Slave D-type Flip Flop.
- **ONEBITCounter.java**: Implementation of the 1-bit binary counter.
- **FOURBITCounter.java**: Implementation of the 4-bit binary counter.


## Testing

- **NANDGateTest.java**: Unit tests for the NAND gate.
- **ANDGateTest.java**: Unit tests for the AND gate.
- **ORGateTest.java**: Unit tests for the OR gate.
- **NORGateTest.java**: Unit tests for the NOR gate.
- **XORGateTest.java**: Unit tests for the XOR gate.
- **DLATCHGateTest.java**: Unit tests of the Gated D Latch.
- **FLIPFLOPGateTest.java**: Unit tests of the Master-Slave D-type Flip Flop.
- **ONEBITCounterTest.java**: Unit tests of the 1-bit binary counter.
- **FOURBITCounterTest.java**: Unit tests of the 4-bit binary counter.

## Usage

To run the project, follow these steps:

1. Clone the repository: `git clone https://github.com/michelkana/cbank-smb-gates.git`
2. Navigate to the project directory: `cd cbank-smb-gates`
3. Build the project using Maven: `mvn clean install`
4. Run the tests: `mvn test`
5. Execute `mvn exec:java -Dexec.mainClass="org.example.Main"`

Feel free to explore the code, add new features, or modify existing components for a deeper understanding of digital logic simulation.

