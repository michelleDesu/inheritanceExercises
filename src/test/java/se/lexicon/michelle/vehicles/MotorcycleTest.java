package se.lexicon.michelle.vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorcycleTest {
    Motorcycle bike;

    @Before
    public void setUp() throws Exception {
        bike = new Motorcycle(
                "Sport",
                "Kawasaki ninja",
                "Green",
                2
        );

    }

    @Test
    public void drive() {
        String expected = "You are now driving a motorcycle with following traits\n"
                + "Brand: Kawasaki ninja\n"
                + "Model: Sport\n"
                + "Color: Green\n"
                + "Nr of wheels: 2\n";
        System.out.println(bike.drive());

        assertEquals(expected, bike.drive() );
    }

    @Test
    public void getModel() {
        String expected = "Sport";
        assertEquals(expected, bike.getModel() );
    }

    @Test
    public void setModel() {
        String expected = "classic";
        bike.setModel(expected);
        assertEquals(expected, bike.getModel() );

    }

    @Test
    public void given_brand_setBrand_return_correct_type_from_getBrand() {
        String expected = "kawasaki";
        bike.setBrand("kawasaki");
        String actual = bike.getBrand();
        assertEquals(expected, actual);
    }
    @Test
    public void given_color_setColor_return_correct_type_from_getColor() {
        String expected = "blue";
        bike.setColour("blue");
        String actual = bike.getColour();
        assertEquals(expected, actual);
    }
    @Test
    public void given_nrOfWheels_setNrOfWheels_return_correct_type_from_getNrOfWheels() {
        int expected = 1,
                actual;
        bike.setNrOfWheels(expected);
        actual = bike.getNrOfWheels();

        assertEquals(expected, actual);
    }
}