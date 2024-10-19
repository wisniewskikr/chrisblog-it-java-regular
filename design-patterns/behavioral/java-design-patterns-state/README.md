## Goal

Goal of this project is to create **State** behavioral design pattern.

## Explanation

**The State Dessing Pattern**: it allows an object to alter its behavior when its internal state changes. It other words calling the same method many times changes result because of internal state is changed. For instance: traffic lights (from greent -> red -> yellow -> green etc.)

## Hints

Hints:
* Create interface TrafficLight
* Create classes GreenState, YellowState and ReedState which implement interface TrafficLight
* Create class TrafficLightContext with TrafficLight as constructor and setter. This GreetingContext has method greet() which returns different results every time