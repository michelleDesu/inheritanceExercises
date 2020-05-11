package se.lexicon.michelle.vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle testVehicle;

    @Before
    public void setUp() throws Exception {
        testVehicle = new Vehicle(
                "Car",
                "Volvo",
                "Red" ,
                4);
    }

    @Test
    public void given_type_setType_return_correct_type_from_getType() {
        String expected = "Motorcycle";
        testVehicle.setType("Motorcycle");
        String actual = testVehicle.getType();
        assertEquals(expected, actual);
    }
    @Test
    public void given_brand_setBrand_return_correct_type_from_getBrand() {
        String expected = "kawasaki";
        testVehicle.setBrand("kawasaki");
        String actual = testVehicle.getBrand();
        assertEquals(expected, actual);
    }
    @Test
    public void given_color_setColor_return_correct_type_from_getColor() {
        String expected = "blue";
        testVehicle.setColour("blue");
        String actual = testVehicle.getColour();
        assertEquals(expected, actual);
    }
    @Test
    public void given_nrOfWheels_setNrOfWheels_return_correct_type_from_getNrOfWheels() {
        int expected = 2,
            actual;
        testVehicle.setNrOfWheels(expected);
        actual = testVehicle.getNrOfWheels();

        assertEquals(expected, actual);
    }
}
