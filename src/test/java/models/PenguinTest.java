package test.java.models;

import main.java.models.Penguin; // Correct package path for Penguin

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Penguin class
 */
public class PenguinTest {

    private Penguin penguin;

    @BeforeEach
    public void setUp() {
        penguin = new Penguin();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("Penguin", penguin.getNameOfAnimal());
    }

    @Test
    public void testGetSetIsSwimming() {
        penguin.setSwimming(true);
        assertTrue(penguin.isSwimming());

        penguin.setSwimming(false);
        assertFalse(penguin.isSwimming());
    }

    @Test
    public void testGetSetWalkSpeed() {
        penguin.setWalkSpeed(3);
        assertEquals(3, penguin.getWalkSpeed());
    }

    @Test
    public void testGetSetSwimSpeed() {
        penguin.setSwimSpeed(10);
        assertEquals(10, penguin.getSwimSpeed());
    }

    @Test
    public void testGetSetAge() {
        penguin.setAge(7);
        assertEquals(7, penguin.getAge());
    }

    @Test
    public void testGetSetHeight() {
        penguin.setHeight(75);
        assertEquals(75, penguin.getHeight());
    }

    @Test
    public void testGetSetWeight() {
        penguin.setWeight(40);
        assertEquals(40, penguin.getWeight());
    }
}