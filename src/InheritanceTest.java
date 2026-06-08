/*
Packages are groups of related classes. They are referenced in a similar way to
file directories. We can define our own packages, or reference built-in packages
from the Java API.

import package.name.ClassName       // Import a single class
import package.name.*               // Import the whole package


 */

import java.util.Arrays;
import java.util.Scanner;

/*
We can inherit the attributes and methods from one class to another using inheritance. The class
that has inherited from another class (called the superclass) is called the subclass.

This is performed through the extends keyword. The class will retain access to all attributes
and methods that had the public or protected keyword. Any private ones will not be accessible.

NOTE: YOU CAN BLOCK A CLASS FROM BEING INHERITED FROM BY GIVING IT THE FINAL KEYWORD!
final class ClassName {}

 */

public class InheritanceTest extends AbstractTest {

    // Encapsulation means hiding sensitive data from users. This is done through
    // declaring variables/attributes as private, and providing public get and set
    // methods to update and retrieve these values

    private String streamingService;
    private String beverage;
    final public String preferredPopcorn = "Salted Caramel";

    public void setStreamingService(String service) {
        this.streamingService = service;
    }

    public String getStreamingService() {
        return this.streamingService;
    }

    // Example of the Scanner class
    public void setBeverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Desired Beverage: ");
        this.beverage = scanner.nextLine();
    }

    public String getBeverage() {
        return this.beverage;
    }

    // We call the constructor of the inherited class through super()
    public InheritanceTest(String[] shows) {
        super(shows);
    }

    // For extending an abstract class, we must define the abstract method!
    public void listShows() {
        // We can access superclass attributes through super.attributeName.
        // This feels needless though, as this.attributeName works just as well
        // Maybe it is better for tracking where attributes originate from?
        System.out.println(Arrays.toString(this.tvShows));
    }

    /*
    Polymorphism is where inherited methods are modified to fit the interactions
    required for the subclass. The superclass and subclass both use the same
    functional declaration, but having different definitions.
    */
    public void isAbstract() {
        System.out.println("I am not an abstract class!");

        // We can similarly call the superclass' version of it through the super keyword
        // super.isAbstract();
    }

    // Classes can be nested inside each other. This is called inner classes
    // Its data type is called OuterClassName.InnerClassName

    // A regular class is created using = OuterClassName.new InnerClassName();
    class InnerClassTest {
        final private int reallyCoolNumber = 33;
        public int getCoolNumber() { return this.reallyCoolNumber; }

        // Because of how scoping works, inner classes can access their outer
        // class attributes and methods
        public void refreshed() { System.out.println("Ahhh, I love " + preferredPopcorn + " popcorn!"); }

    }

    // A private inner class cannot be made outside the outer class
    private class SuperSecretClass {
        final private int secretNumber = -1;
        public int getSecretNumber() { return this.secretNumber; }
    }

    // A static inner class can be created without referencing an object
    static class StaticInnerClassGoBrrr {
        final private int brrr = 1;
        public int getCoolNumber() { return this.brrr; }
    }



}