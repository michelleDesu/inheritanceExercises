package se.lexicon.michelle.vehicles;

public abstract class Vehicle {
    private String brand,
                    colour;
    private int     nrOfWheels;

    public Vehicle( String brand, String colour, int nrOfWheels) {

        this.brand = brand;
        this.colour = colour;
        this.nrOfWheels = nrOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String color) {
        this.colour = color;
    }

    public int getNrOfWheels() {
        return nrOfWheels;
    }

    public void setNrOfWheels(int nrOfWheels) {
        this.nrOfWheels = nrOfWheels;
    }

    public abstract String drive();
}
