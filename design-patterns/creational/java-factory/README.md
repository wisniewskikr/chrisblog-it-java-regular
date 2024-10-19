## Goal

Goal of this project is to create **Factory** creational design pattern.

## Explanation

**The Factory Design Pattern**: it is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This is particularly useful when you want to manage and manipulate a collection of related classes.

## Hints

Hints:
* Create interface Greeting
* Create classes HelloGreeting and GoodbayGreeting which implement interface Greeting
* Create class GreetingFactory with method createGreeting() which returs specific Greeting class basing on attribute - "hello", "goodbay" etc.