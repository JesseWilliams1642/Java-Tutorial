/*
    Non-access modifiers do not control visibility, but instead adds other features to
    classes, methods and attributes.
        1. Final: Values cannot be overwritten
        2. Static: Methods or attributes do not belong to a specific object, instead
           belonging to the class itself
        3. Abstract: Consisting of only a declaration (name, return type, parameters),
           and not of its contents/body
        4. Transient: Attributes and methods are skipped when serialising the object
           containing them
        5. Synchronized: Methods can only be accessed by one thread at a time
        6. Volatile: The value of an attribute is not cached thread-locally, and is always
           read from the "main memory"
     */
// Classes can only use the final and abstract non-access modifiers

abstract public class AbstractTest {

    /*
    Data abstraction is the process of hiding details and showing only essential information
    to the user. Abstraction is achieved by either abstract classes or interfaces.

    Abstract classes are a restricted class that cannot be used to create objects. To access
    it, another class must inherit from it.

    Abstract methods can only be created in abstract classes. Subclasses of the abstract class
    must define the body of the abstract method, else that class must also be abstract.
     */

    protected String[] tvShows;
    final protected boolean bingeWatcher = true;

    public AbstractTest(String[] shows) {
        this.tvShows = shows;
    }

    // Abstract method. Must be defined when inherited by a subclass
    abstract public void listShows();

    // Defined methods will get inherited
    public void isAbstract() {
        System.out.println("I am an abstract class!");
    }

}