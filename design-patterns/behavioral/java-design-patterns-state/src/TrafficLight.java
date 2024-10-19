

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}