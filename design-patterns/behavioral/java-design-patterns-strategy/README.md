## Goal

Goal of this project is to create **Strategy** behavioral design pattern.

## Explanation

**The Strategy Design Pattern**: it is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. In other words we create some class and method of this class returns different results basing on new strategy.

## Hints

Hints:
* Create interface GreetingStrategy
* Create classes HelloGreeting and GoodbayGreeting which implement interface GreetingStrategy
* Create class GreetingContext with GreetingStratety as constructor and setter. This GreetingContext has method greet() which returns different results basing on current strategy of object