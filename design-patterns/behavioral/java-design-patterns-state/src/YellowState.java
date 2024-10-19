

public class YellowState implements TrafficLightState {
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing light from Yellow to Red.");
        light.setState(new RedState());
    }
}