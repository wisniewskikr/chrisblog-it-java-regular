

public class RedState implements TrafficLightState {
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing light from Red to Green.");
        light.setState(new GreenState());
    }
}