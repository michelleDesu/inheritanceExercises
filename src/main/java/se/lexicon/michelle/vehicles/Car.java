package se.lexicon.michelle.vehicles;

import se.lexicon.michelle.utils.Weekday;

public class Car extends Vehicle{

    private String  model,
                    engine;


    public Car(String brand, String colour, int nrOfWheels, String model, String engine) {
        super(brand, colour, nrOfWheels);
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String drive() {
        return "You are now driving a car with following traits\n"
                + "Brand: " + getBrand() + "\n"
                + "Model: " + getModel() + "\n"
                + "Color: " + getColour() + "\n"
                + "Nr of wheels: " + getNrOfWheels() + "\n"
                + "engine: " + getEngine() + "\n";
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
