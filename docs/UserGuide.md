# Zoo Management System - User Guide

## Introduction

The Zoo Management System is an interactive console application that allows you to manage and interact with different types of animals in a virtual zoo. This guide will help you understand how to use the system.

## Getting Started

### System Requirements
- Java 11 or higher
- Maven (for building from source)

### Running the Application

#### From JAR file:
```bash
java -jar zoo-management-system.jar
```

#### From source code:
```bash
# Clone the repository
git clone https://github.com/username/zoo-management-system.git

# Navigate to the project directory
cd zoo-management-system

# Build the project
mvn clean package

# Run the application
java -jar target/zoo-management-system-1.0-SNAPSHOT.jar
```

## Using the Application

### Main Menu

When you start the application, you'll see the main zoo animal choice menu:

```
******* ZOO ANIMAL CHOICE MENU ******
1. Tiger
2. Dolphin
3. Penguin
Enter choice of animal (1-3):
```

Enter the number corresponding to the animal you want to interact with.

### Animal Details Menu

After selecting an animal, you'll see the animal details menu:

```
******* ANIMAL DETAILS MENU FOR: [Animal Name] ******
1. Set properties
2. Display properties
3. Display movement
4. Display eating
5. Return to main menu
Enter choice (1-5):
```

### Menu Options

#### 1. Set Properties

This option allows you to set the properties of the selected animal:

- For all animals:
  - Age
  - Height
  - Weight

- For Tiger:
  - Number of stripes
  - Speed
  - Sound level of roar

- For Dolphin:
  - Color
  - Swimming speed

- For Penguin:
  - Swimming status (true/false)
  - Walk speed
  - Swim speed

Follow the prompts to enter values for each property.

#### 2. Display Properties

This option displays all the current properties of the selected animal.

#### 3. Display Movement

This option shows how the animal moves:
- Tigers walk
- Dolphins swim
- Penguins either walk or swim, depending on their current swimming status

#### 4. Display Eating

This option shows the animal's eating behavior and what happens when it finishes eating.

#### 5. Return to Main Menu

This option returns you to the main animal choice menu.

### Input Validation

The system validates all user inputs:
- Numeric inputs must be valid integers within specified ranges
- Boolean inputs must be either "true" or "false"
- String inputs cannot be empty

If you enter invalid input, the system will display an error message and prompt you to enter the value again.

### Exiting the Application

After each animal interaction, you'll be asked if you want to continue with the current animal. If you select "no", you'll return to the main menu.

At the main menu, you'll be asked if you want to continue with the zoo menu. If you select "no", the application will exit.

## Examples

### Example 1: Setting Tiger Properties

1. From the main menu, select "1" for Tiger
2. From the animal details menu, select "1" to set properties
3. Enter values when prompted:
   - Age: 5
   - Height: 100
   - Weight: 200
   - Number of stripes: 120
   - Speed: 35
   - Sound level of roar: 9
4. The properties are now set for the tiger

### Example 2: Displaying Penguin Movement

1. From the main menu, select "3" for Penguin
2. From the animal details menu, select "1" to set properties
3. Enter values including swimming status (true or false)
4. From the animal details menu, select "3" to display movement
5. The penguin will either swim or walk based on its swimming status

## Troubleshooting

### Common Issues

- **Invalid input error**: Make sure to enter values within the specified ranges and of the correct type.
- **Main menu not showing**: If you're seeing unexpected behavior, try restarting the application.

### Getting Help

If you encounter any issues not covered in this guide, please submit an issue on the GitHub repository at: https://github.com/username/zoo-management-system/issues