# Zoo Management System - System Design Document

## 1. Introduction

The Zoo Management System is a Java-based application that demonstrates object-oriented programming principles through the simulation of zoo animal management. This document outlines the system architecture, class relationships, and design decisions.

## 2. System Architecture

The system follows a layered architecture with:

### 2.1 Model Layer
Contains the core domain classes representing animals and their behaviors:
- Abstract base class: `Animal`
- Concrete animal classes: `Tiger`, `Dolphin`, `Penguin`
- Behavior interfaces: `Eat`, `Walk`, `Swim`

### 2.2 Utility Layer
Contains helper classes for system operations:
- `InputValidator`: For validating user input

### 2.3 View/Controller Layer
Handles user interaction and controls program flow:
- `Main`: Implements the menu system and controls interaction with animals

## 3. Class Diagram

```
┌───────────────┐         ┌───────────┐
│   <<interface>>   │         │ <<abstract>> │
│       Eat     │<─────────│   Animal  │
└───────────────┘         └─────┬─────┘
                                │
┌───────────────┐               │
│   <<interface>>   │               │
│      Walk     │<─────────┬─────┴──────┬─────────┐
└───────────────┘         │            │         │
                          │            │         │
┌───────────────┐  ┌──────▼─────┐ ┌────▼───┐ ┌───▼────┐
│   <<interface>>   │  │    Tiger    │ │ Dolphin │ │ Penguin │
│      Swim     │<─┼────────────┘ └────┬───┘ └───┬────┘
└───────────────┘  │                   │         │
                   └───────────────────┘         │
                                                 │
                                                 │
┌───────────────┐                                │
│InputValidator │<───────────────────────────────┘
└───────────────┘
```

## 4. Design Decisions

### 4.1 Abstract Base Class
The `Animal` class is designed as an abstract base class to:
- Share common animal properties (name, weight, height, age)
- Implement common behavior (basic eating functionality)
- Force concrete subclasses to implement abstract methods

### 4.2 Interface Usage
Interfaces are used to define capabilities:
- `Eat`: All animals need to eat (implemented at the `Animal` level)
- `Walk`: Only land animals can walk
- `Swim`: Only aquatic animals can swim

This approach allows for:
- Multiple inheritance of behavior (e.g., `Penguin` can both walk and swim)
- Easy extension for new behaviors

### 4.3 Polymorphism
The system heavily utilizes polymorphism to:
- Treat different animal types uniformly where appropriate
- Apply specific behaviors based on actual object type
- Reduce code duplication in the `Main` class

### 4.4 Input Validation
A dedicated `InputValidator` class is used to:
- Centralize validation logic
- Provide consistent error handling
- Improve code readability and maintainability

## 5. Extension Points

The system is designed for easy extension:

### 5.1 New Animal Types
To add new animal types:
1. Create a new class extending `Animal`
2. Implement required interfaces based on capabilities
3. Add specific properties and behaviors
4. Update the `Main` class to include the new animal type

### 5.2 New Behaviors
To add new behaviors:
1. Create a new interface defining the behavior
2. Implement the interface in relevant animal classes
3. Update the `Main` class to offer options for the new behavior

## 6. Testing Strategy

The system includes JUnit tests that verify:
- Proper initialization of objects
- Correct behavior of getters and setters
- Proper implementation of interface methods

## 7. Future Enhancements

Potential enhancements include:
- Persistent storage using file I/O or a database
- Graphical user interface
- Animal interaction simulations
- Environmental factors affecting animal behaviors
- More advanced polymorphic behavior demonstrations