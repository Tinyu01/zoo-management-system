package test.java.models;

import main.java.models.Tiger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Tiger class
 */
public class TigerTest {

    private Tiger tiger;

    @BeforeEach
    public void setUp() {
        tiger = new Tiger();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("Tiger", tiger.getNameOfAnimal());
    }

    @Test
    public void testGetSetNumberOfStripes() {
        tiger.setNumberOfStripes(100);
        assertEquals(100, tiger.getNumberOfStripes());
    }

    @Test
    public void testGetSetSpeed() {
        tiger.setSpeed(50);
        assertEquals(50, tiger.getSpeed());
    }

    @Test
    public void testGetSetSoundLevelOfRoar() {
        tiger.setSoundLevelOfRoar(8);
        assertEquals(8, tiger.getSoundLevelOfRoar());
    }

    @Test
    public void testGetSetAge() {
        tiger.setAge(5);
        assertEquals(5, tiger.getAge());
    }

    @Test
    public void testGetSetHeight() {
        tiger.setHeight(120);
        assertEquals(120, tiger.getHeight());
    }

    @Test
    public void testGetSetWeight() {
        tiger.setWeight(200);
        assertEquals(200, tiger.getWeight());
    }
}