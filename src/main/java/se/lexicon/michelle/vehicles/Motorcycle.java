package se.lexicon.michelle.vehicles;

public class Motorcycle extends Vehicle{
    private String model;

    public Motorcycle(String model, String brand, String color, int nrOfWheels) {
        super(brand, color, nrOfWheels);
        setModel(model);
    }


    @Override
    public String drive() {

        return "You are now driving a motorcycle with following traits\n"
                + "Brand: " + getBrand() + "\n"
                + "Model: " + getModel() + "\n"
                + "Color: " + getColour() + "\n"
                + "Nr of wheels: " + getNrOfWheels() + "\n";

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
