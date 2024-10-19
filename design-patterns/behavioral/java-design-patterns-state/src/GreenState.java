

public class GreenState implements TrafficLightState {
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing light from Green to Yellow.");
        light.setState(new YellowState());
    }
}