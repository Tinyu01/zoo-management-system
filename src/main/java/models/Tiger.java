package main.java.models;

import main.java.interfaces.Walk;

/**
 * Class representing a Tiger, extending the abstract Animal class
 * and implementing the Walk interface.
 */
public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    /**
     * Default constructor for Tiger
     */
    public Tiger() {
        super("Tiger");
    }

    /**
     * Gets the number of stripes on the tiger
     * 
     * @return the number of stripes
     */
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    /**
     * Sets the number of stripes on the tiger
     * 
     * @param numberOfStripes the number of stripes to set
     */
    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    /**
     * Gets the speed of the tiger
     * 
     * @return the speed in mph
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the tiger
     * 
     * @param speed the speed to set in mph
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets the sound level of the tiger's roar
     * 
     * @return the sound level (1-10)
     */
    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    /**
     * Sets the sound level of the tiger's roar
     * 
     * @param soundLevelOfRoar the sound level to set (1-10)
     */
    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    /**
     * Implementation of eatingCompleted method from Eat interface
     */
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    /**
     * Implementation of walking method from Walk interface
     */
    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed " + speed + " mph");
    }
}