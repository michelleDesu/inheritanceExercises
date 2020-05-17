package se.lexicon.michelle.CarBase;

public class Car extends CarBase implements CarColour{

    public Car(String carName) {
        super(carName);
    }

    @Override
    public void Colour(String colour) {
        System.out.println("The colour of your car is: " + colour);
    }
}
