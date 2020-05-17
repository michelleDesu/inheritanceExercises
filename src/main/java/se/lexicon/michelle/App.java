package se.lexicon.michelle;

import se.lexicon.michelle.vehicles.Car;
import se.lexicon.michelle.vehicles.Motorcycle;
import se.lexicon.michelle.vehicles.Truck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        runVehicle();
    }

    private static void runVehicle(){
        Car car = new Car(
                "Volvo",
                "Red",
                4,
                "Combi",
                "V70"
        );

        Truck truck = new Truck(
                "Trailer",
                "Scania",
                "Blue",
                6,
                true
        );

        Motorcycle bike = new Motorcycle(
                "Sport",
                "Kawasaki ninja",
                "Green",
                2
        );
        System.out.println(car.drive());
        System.out.println(truck.drive());
        System.out.println(bike.drive());


    }

}
