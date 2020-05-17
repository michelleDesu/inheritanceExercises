package se.lexicon.michelle;

import se.lexicon.michelle.books.TeenageBook;
import se.lexicon.michelle.iceCream.Chocolate;
import se.lexicon.michelle.iceCream.IceCream;
import se.lexicon.michelle.iceCream.Vanilla;
import se.lexicon.michelle.vehicles.Car;
import se.lexicon.michelle.vehicles.Motorcycle;
import se.lexicon.michelle.vehicles.Truck;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //runVehicle();
        //runBooks();
        runIceCream();
    }

    private static void runIceCream(){
        IceCream ice = new IceCream();
        Chocolate chocolate = new Chocolate();
        Vanilla vanilla = new Vanilla();

        ice.description();
        chocolate.description();
        vanilla.description();

    }

    private static void runBooks(){
        TeenageBook teenageBook,
                storyBooks;
        Scanner scanner = new Scanner(System.in);
        teenageBook = new TeenageBook(
                "Äppelträdet",
                "Olle sandberg",
                "teenage book",
                2017,
                55
        );

        storyBooks = new TeenageBook(
                "Samlade Sagor",
                "Michelle Johansson",
                "teenage book",
                2020,
                teenageBook.getPages()
        );
        storyBooks.addTeenBook(teenageBook);

        System.out.println("Print the title of the teenage book you want to find: ");
        String answer = scanner.nextLine();
        System.out.println(storyBooks.SearchTeenageBook(answer));

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
