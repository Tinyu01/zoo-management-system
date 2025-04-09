package main.java.models;

import main.java.interfaces.Eat;

/**
 * Abstract base class representing a generic animal.
 * Implements the Eat interface for food consumption behaviors.
 */
abstract public class Animal implements Eat {
    private String nameOfAnimal;
    private int weight;
    private int height;
    private int age;

    /**
     * Default constructor
     */
    public Animal() {
        nameOfAnimal = "Unknown Animal";
    }

    /**
     * Constructor with name parameter
     * 
     * @param nameOfAnimal the name of the animal
     */
    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    /**
     * Gets the name of the animal
     * 
     * @return the name of the animal
     */
    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    /**
     * Sets the name of the animal
     * 
     * @param nameOfAnimal the name to set
     */
    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    /**
     * Gets the weight of the animal
     * 
     * @return the weight in kilograms
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the animal
     * 
     * @param weight the weight to set in kilograms
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets the height of the animal
     * 
     * @return the height in centimeters
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the animal
     * 
     * @param height the height to set in centimeters
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the age of the animal
     * 
     * @return the age in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the animal
     * 
     * @param age the age to set in years
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Implementation of eating behavior from Eat interface
     */
    @Override
    public void eatingFood() {
        System.out.println("The animal: " + nameOfAnimal + " is eating.");
    }
}