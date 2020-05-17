package se.lexicon.michelle.CarBase;

public class Cars extends CarBase implements CarColour{

    public Cars(String carName) {
        super(carName);

    }

    @Override
    public void Colour(String colour) {
        System.out.println("The colour of your " +  this.getCarName()+ " is: " + colour);
    }
}
