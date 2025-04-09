package main.java.models;

import main.java.interfaces.Swim;

/**
 * Class representing a Dolphin, extending the abstract Animal class
 * and implementing the Swim interface.
 */
public class Dolphin extends Animal implements Swim {
    private String color;
    private int swimmingSpeed;

    /**
     * Default constructor for Dolphin
     */
    public Dolphin() {
        super("Dolphin");
    }

    /**
     * Gets the color of the dolphin
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the dolphin
     * 
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the swimming speed of the dolphin
     * 
     * @return the swimming speed in nautical mph
     */
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    /**
     * Sets the swimming speed of the dolphin
     * 
     * @param swimmingSpeed the swimming speed to set in nautical mph
     */
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    /**
     * Override of eatingFood method from Animal class
     */
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    /**
     * Implementation of eatingCompleted method from Eat interface
     */
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    /**
     * Implementation of swimming method from Swim interface
     */
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }
}