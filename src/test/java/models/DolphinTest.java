package test.java.models;

import main.java.models.Dolphin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Dolphin class
 */
public class DolphinTest {

    private Dolphin dolphin;

    @BeforeEach
    public void setUp() {
        dolphin = new Dolphin();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("Dolphin", dolphin.getNameOfAnimal());
    }

    @Test
    public void testGetSetColor() {
        dolphin.setColor("Grey");
        assertEquals("Grey", dolphin.getColor());
    }

    @Test
    public void testGetSetSwimmingSpeed() {
        dolphin.setSwimmingSpeed(25);
        assertEquals(25, dolphin.getSwimmingSpeed());
    }

    @Test
    public void testGetSetAge() {
        dolphin.setAge(12);
        assertEquals(12, dolphin.getAge());
    }

    @Test
    public void testGetSetHeight() {
        dolphin.setHeight(240);
        assertEquals(240, dolphin.getHeight());
    }

    @Test
    public void testGetSetWeight() {
        dolphin.setWeight(150);
        assertEquals(150, dolphin.getWeight());
    }
}