package main.java;

import main.java.models.Animal;
import main.java.models.Tiger;
import main.java.models.Dolphin;
import main.java.models.Penguin;

import java.util.Scanner;

/**
 * Main driver class for the Zoo Management System.
 * Provides a menu-driven interface for interacting with different animals.
 */
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop = 1;

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    handleAnimalInteraction(keyboard, tigerObject);
                    break;
                case 2:
                    handleAnimalInteraction(keyboard, dolphinObject);
                    break;
                case 3:
                    handleAnimalInteraction(keyboard, penguinObject);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }
            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();
        } while (continueOuterLoop == 1);

        System.out.println("Thank you for visiting our Zoo Management System!");
        keyboard.close();
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("Enter choice of animal (1-3):");
        return keyboard.nextInt();
    }

    private static void handleAnimalInteraction(Scanner keyboard, Animal animal) {
        int continueInnerLoop = 1;
        int menuChoice;
        do {
            System.out.println("The animal which is chosen is : " + animal.getNameOfAnimal());
            menuChoice = animalDetailsManipulationMenu(keyboard, animal);
            switch (menuChoice) {
                case 1:
                    setAnimalProperties(keyboard, animal);
                    break;
                case 2:
                    displayAnimalProperties(animal);
                    break;
                case 3:
                    if (animal instanceof Tiger) {
                        ((Tiger) animal).walking();
                    } else if (animal instanceof Dolphin) {
                        ((Dolphin) animal).swimming();
                    } else if (animal instanceof Penguin) {
                        Penguin penguin = (Penguin) animal;
                        if (penguin.isSwimming()) {
                            penguin.swimming();
                        } else {
                            penguin.walking();
                        }
                    }
                    break;
                case 4:
                    animal.eatingFood();
                    animal.eatingCompleted();
                    break;
                default:
                    System.out.println("Not supported");
            }
            System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
            continueInnerLoop = keyboard.nextInt();
        } while (continueInnerLoop == 1);
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("Enter choice (1-4):");
        return keyboard.nextInt();
    }

    private static void setAnimalProperties(Scanner keyboard, Animal animal) {
        System.out.println("Enter age:");
        animal.setAge(keyboard.nextInt());
        System.out.println("Enter height:");
        animal.setHeight(keyboard.nextInt());
        System.out.println("Enter weight:");
        animal.setWeight(keyboard.nextInt());
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            System.out.println("Enter number of stripes:");
            tiger.setNumberOfStripes(keyboard.nextInt());
            System.out.println("Enter speed:");
            tiger.setSpeed(keyboard.nextInt());
            System.out.println("Enter sound level of roar:");
            tiger.setSoundLevelOfRoar(keyboard.nextInt());
        } else if (animal instanceof Dolphin) {
            Dolphin dolphin = (Dolphin) animal;
            System.out.println("Enter color:");
            dolphin.setColor(keyboard.next());
            System.out.println("Enter swimming speed:");
            dolphin.setSwimmingSpeed(keyboard.nextInt());
        } else if (animal instanceof Penguin) {
            Penguin penguin = (Penguin) animal;
            System.out.println("Is the penguin swimming (true/false):");
            penguin.setSwimming(keyboard.nextBoolean());
            System.out.println("Enter the walk speed of the penguin:");
            penguin.setWalkSpeed(keyboard.nextInt());
            System.out.println("Enter the swim speed of the penguin:");
            penguin.setSwimSpeed(keyboard.nextInt());
        }
    }

    private static void displayAnimalProperties(Animal animal) {
        System.out.println("Age: " + animal.getAge());
        System.out.println("Height: " + animal.getHeight());
        System.out.println("Weight: " + animal.getWeight());
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            System.out.println("Number of stripes: " + tiger.getNumberOfStripes());
            System.out.println("Speed: " + tiger.getSpeed());
            System.out.println("Sound level of roar: " + tiger.getSoundLevelOfRoar());
        } else if (animal instanceof Dolphin) {
            Dolphin dolphin = (Dolphin) animal;
            System.out.println("Color: " + dolphin.getColor());
            System.out.println("Swimming speed: " + dolphin.getSwimmingSpeed());
        } else if (animal instanceof Penguin) {
            Penguin penguin = (Penguin) animal;
            System.out.println("Walking Speed: " + penguin.getWalkSpeed());
            System.out.println("Swimming Speed: " + penguin.getSwimSpeed());
        }
    }
}