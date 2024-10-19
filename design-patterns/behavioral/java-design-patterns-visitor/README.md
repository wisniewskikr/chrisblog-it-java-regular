## Goal

Goal of this project is to create **Visitor** behavioral design pattern. It should be used if you want to add some new functionality to many existing elements without changing their code. This new functionality is in Visitor.

## Explanation

**The Visitor Design Pattern** is a behavioral pattern that allows you to add new operations to a class hierarchy without modifying the classes. It is useful when you want to perform various operations on objects of different types, which are part of the same inheritance hierarchy.

## Hints

Hints:
* Create interface Visitor with many methods visit(Element)
* Create interface Element with method accept(Visitor)
* Create many class Element
* Create one class Visitor
* Iterate over Elements and add call accept(Visitor)