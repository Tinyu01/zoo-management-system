package main.java.models;

import main.java.interfaces.Walk;
import main.java.interfaces.Swim;

/**
 * Class representing a Penguin, extending the abstract Animal class
 * and implementing both Walk and Swim interfaces.
 */
public class Penguin extends Animal implements Walk, Swim {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    /**
     * Default constructor for Penguin
     */
    public Penguin() {
        super("Penguin");
    }

    /**
     * Checks if the penguin is currently swimming
     * 
     * @return true if swimming, false otherwise
     */
    public boolean isSwimming() {
        return isSwimming;
    }

    /**
     * Sets whether the penguin is swimming
     * 
     * @param swimming true if swimming, false otherwise
     */
    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    /**
     * Gets the walking speed of the penguin
     * 
     * @return the walking speed in mph
     */
    public int getWalkSpeed() {
        return walkSpeed;
    }

    /**
     * Sets the walking speed of the penguin
     * 
     * @param walkSpeed the walking speed to set in mph
     */
    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    /**
     * Gets the swimming speed of the penguin
     * 
     * @return the swimming speed in nautical mph
     */
    public int getSwimSpeed() {
        return swimSpeed;
    }

    /**
     * Sets the swimming speed of the penguin
     * 
     * @param swimSpeed the swimming speed to set in nautical mph
     */
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    /**
     * Override of eatingFood method from Animal class
     */
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish");
    }

    /**
     * Implementation of eatingCompleted method from Eat interface
     */
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    /**
     * Implementation of walking method from Walk interface
     */
    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    /**
     * Implementation of swimming method from Swim interface
     */
    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }
}