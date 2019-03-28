package code;

public class Output extends LogicGate {
    private int index;

    public Output(String pid, LogicCircuit c, int index) {
        super(pid, c);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public boolean isOutput() {
        return true;
    }

}
