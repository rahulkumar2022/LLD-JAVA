package Traffic-signals;

public class Road {
    private int id;
    private String name;
    private Signal signal;

    public Road(int id, String name) {
        this.id = id;
        this.name = name;
        this.signal = Signal.GREEN;
    }

    public void setSignal(Signal signal) {
        this.signal = signal;
    }

    public Signal getSignal(){
        return signal;
    }
}
