package se.lexicon.michelle.CarBase;

/*
    renamed class from Car to Cars to be able to have the classes int hte same project,
    this due to Car already existing in the Vehicle package.
 */
public class Cars extends CarBase implements CarColour{

    public Cars(String carName) {
        super(carName);

    }

    @Override
    public void Colour(String colour) {
        System.out.println("The colour of your " +  this.getCarName()+ " is: " + colour);
    }
}
