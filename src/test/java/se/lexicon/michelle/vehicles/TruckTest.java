package se.lexicon.michelle.vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TruckTest {
    private Truck truck;
    @Before
    public void setUp() throws Exception {
       truck = new Truck(
               "Trailer",
               "Scania",
               "Blue",
               6,
               true
       );
    }

    @Test
    public void drive_haveTrailer_true() {

        System.out.println(truck.drive());
        String expected = "You are now driving a truck with following traits\n" +
                "Brand: " + truck.getBrand() + "\n" +
                "Color: " + truck.getColour() + "\n" +
                "Nr of wheels: " + truck.getNrOfWheels() + "\n" +
                "Trailer: Yes\n";
        assertEquals(expected, truck.drive());

    }
    @Test
    public void drive_haveTrailer_false() {
        truck.setHaveTrailer(false);

        System.out.println(truck.drive());
        String expected = "You are now driving a truck with following traits\n" +
                "Brand: " + truck.getBrand() + "\n" +
                "Color: " + truck.getColour() + "\n" +
                "Nr of wheels: " + truck.getNrOfWheels() + "\n" +
                "Trailer: No\n";
        assertEquals(expected, truck.drive());

    }

    @Test
    public void HaveTrailer() {
        assertTrue(truck.haveTrailer());
    }

    @Test
    public void setHaveTrailer() {
        truck.setHaveTrailer(false);
        assertFalse(truck.haveTrailer());
    }

    @Test
    public void given_brand_setBrand_return_correct_type_from_getBrand() {
        String expected = "Volvo";
        truck.setBrand("Volvo");
        String actual = truck.getBrand();
        assertEquals(expected, actual);
    }
    @Test
    public void given_color_setColor_return_correct_type_from_getColor() {
        String expected = "Green";
        truck.setColour("Green");
        String actual = truck.getColour();
        assertEquals(expected, actual);
    }
    @Test
    public void given_nrOfWheels_setNrOfWheels_return_correct_type_from_getNrOfWheels() {
        int expected = 8,
                actual;
        truck.setNrOfWheels(expected);
        actual = truck.getNrOfWheels();

        assertEquals(expected, actual);
    }
}