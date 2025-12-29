Vehicle Management System

This is a Java application that shows object-oriented programming principles:

Inheritance - creating a hierarchy of vehicle classes
Abstraction - using an abstract Vehicle class
Composition - connection between Vehicle and Driver
Polymorphism - overriding methods in subclasses

The system manages different types of vehicles (cars, motorcycles, trucks) and their drivers. It demonstrates how inheritance makes code cleaner and easier to maintain.
Class Hierarchy
Vehicle (abstract class)
├── Car
├── Motorcycle
└── Truck

Driver (separate class for composition)
Class Description
Vehicle (abstract):

Fields: brand, year, driver
Abstract methods: startEngine(), stopEngine()
Concrete method: displayInfo()
Uses protected modifier for access from subclasses

Car, Motorcycle, Truck:

Inherit from Vehicle
Add their own unique fields
Override abstract methods with custom implementations
Use super() to call parent constructor

Driver:

Independent class with fields name and licenseNumber
Connected to Vehicle through composition
One driver can manage multiple vehicles (aggregation)

Access Modifiers Used

private - for class-specific fields
protected - for Vehicle fields accessible to subclasses
public - for methods accessible from outside

How to Compile and Run

javac *.java

java Main

Reflection

For me it was an great assignment where I learnt abstract classes,inheritance,super() function and protected fields.Overall assignment was not difficult 
