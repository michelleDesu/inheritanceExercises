package se.lexicon.michelle.vehicles;

public class Vehicle {
    private String  type,
                    brand,
                    color;
    private int     nrOfWheels;

    public Vehicle(String type, String brand, String color, int nrOfWheels) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.nrOfWheels = nrOfWheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return color;
    }

    public void setColour(String color) {
        this.color = color;
    }

    public int getNrOfWheels() {
        return nrOfWheels;
    }

    public void setNrOfWheels(int nrOfWheels) {
        this.nrOfWheels = nrOfWheels;
    }
}
