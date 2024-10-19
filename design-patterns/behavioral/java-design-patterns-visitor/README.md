## Goal

Goal of this project is to create **Visitor** behavioral design pattern.

## Explanation

**The Visitor Design Pattern** is a behavioral pattern that allows you to add new operations to a class hierarchy without modifying the classes. It is useful when you want to perform various operations on objects of different types, which are part of the same inheritance hierarchy.

## Hints

Hints:
* Create interface Visitor with many methods visit(Element)
* Create interface Element with method accept(Visitor)
* Create many class Element
* Create one class Visitor
* Iterate over Elements and add call accept(Visitor)