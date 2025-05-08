# Zoo Management System

A Java-based object-oriented system for managing zoo animals, demonstrating inheritance, polymorphism, interfaces, and OOP design principles.

## Project Structure

```
zoo-management-system/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── models/
│   │       │   ├── Animal.java
│   │       │   ├── Tiger.java
│   │       │   ├── Dolphin.java
│   │       │   └── Penguin.java
│   │       ├── interfaces/
│   │       │   ├── Eat.java
│   │       │   ├── Walk.java
│   │       │   └── Swim.java
│   │       ├── utils/
│   │       │   └── InputValidator.java
│   │       └── Main.java
│   └── test/
│       └── java/
│           └── models/
│               ├── TigerTest.java
│               ├── DolphinTest.java
│               └── PenguinTest.java
├── .gitignore
├── pom.xml
└── README.md
```

## Design Overview

The Zoo Management System uses object-oriented principles to model different animals and their behaviors:

- **Abstraction**: Through the abstract `Animal` class and interfaces
- **Inheritance**: Animal subtypes extend the base class
- **Polymorphism**: Animals implement different interfaces based on their capabilities
- **Encapsulation**: Private fields with getter/setter methods

## Key Components

### Base Class
- `Animal`: Abstract base class with common properties for all animals

### Interfaces
- `Eat`: Defines eating behaviors
- `Walk`: Defines walking behaviors
- `Swim`: Defines swimming behaviors

### Animal Types
- `Tiger`: Land animal that can walk
- `Dolphin`: Marine animal that can swim
- `Penguin`: Animal that can both walk and swim

### Utilities
- `InputValidator`: Helper for validating user input
- `Main`: Driver class with menu system

## Issues Fixed

1. ✅ Fixed interface implementation in Animal class
2. ✅ Reduced code duplication in menu system
3. ✅ Added input validation
4. ✅ Improved menu structure and user experience
5. ✅ Added JavaDoc documentation

## How to Run

1. Compile the code:
```
javac -d bin src/main/java/*.java src/main/java/*/*.java
```

2. Run the program:
```
java -cp bin Main
```

## Sample Usage

1. Choose an animal from the menu (Tiger, Dolphin, or Penguin)
2. Set properties for the chosen animal
3. Display properties or behaviors
4. Observe the animal's unique characteristics

## Future Enhancements

- Add more animal types
- Implement file-based data persistence
- Create a graphical user interface
- Add environmental factors affecting animal behaviors