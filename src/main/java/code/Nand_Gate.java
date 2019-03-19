package code;

public class Nand_Gate extends LogicGate {
    public Nand_Gate(String pid, LogicCircuit c) {
        super(pid, c);
    }

    public boolean getResult(boolean y1, boolean y2) {
        return (!(y1 & y2));
    }
}
