package Traffic-signals;

public class TrafficLight {
    private final int id;
    private String name;
    private Signal signal;
    
    public TrafficLight(int id, String name, Signal signal) {
        this.id = id;
        this.name = name;
        this.signal = signal;
    }
}
