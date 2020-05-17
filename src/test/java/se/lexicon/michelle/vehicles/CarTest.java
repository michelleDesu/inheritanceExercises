package se.lexicon.michelle.vehicles;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car(
                "Volvo",
                "Red",
                4,
                "Combi",
                "V70"
        );

    }

    @Test
    public void testDrive() {
        String expected = "You are now driving a car with following traits\n"
                + "Brand: Volvo\n"
                + "Model: Combi\n"
                + "Color: Red\n"
                + "Nr of wheels: 4\n"
                + "engine: V70\n";
        System.out.println(car.drive());
        Assert.assertEquals(expected, car.drive());
    }

    @Test
    public void testGetModel() {
        String expected = "Combi";
        Assert.assertEquals(expected, car.getModel());
    }

    @Test
    public void testSetModel() {
        String expected = "Sport";
        car.setModel("Sport");
        Assert.assertEquals(expected, car.getModel());
    }

    @Test
    public void testGetEngine() {
        String expected = "V70";
        Assert.assertEquals(expected, car.getEngine());
    }

    @Test
    public void testSetEngine() {
        String expected = "V75";
        car.setEngine("V75");
        Assert.assertEquals(expected, car.getEngine());
    }

    @Test
    public void given_brand_setBrand_return_correct_type_from_getBrand() {
        String expected = "kawasaki";
        car.setBrand("kawasaki");
        String actual = car.getBrand();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void given_color_setColor_return_correct_type_from_getColor() {
        String expected = "blue";
        car.setColour("blue");
        String actual = car.getColour();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void given_nrOfWheels_setNrOfWheels_return_correct_type_from_getNrOfWheels() {
        int expected = 2,
                actual;
        car.setNrOfWheels(expected);
        actual = car.getNrOfWheels();

        Assert.assertEquals(expected, actual);
    }
}