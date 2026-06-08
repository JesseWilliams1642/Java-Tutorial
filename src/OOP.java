/*
Procedural programming is about writing procedures or methods that perform operations
on data. Object-Oriented Programming (OOP) is about creating objects that contain data
and the methods that act on them.

OOP has advantages over procedural programming through:
    * Faster and easier to execute
    * Proves a clear structure for programs
    * Helps promote DRY (Don't Repeat Yourself) principles, making code maintenance,
      modification and debugging easier
    * Makes it possible to create full reusable applications with less code and
      in shorter time

A class is a template for objects. An object is an instance of a class. When objects are
created, they inherit the variables and methods from the class.

Classes can be described as object constructors or "blueprints". Everything in Java is based
on classes and objects.

*/

// We create a class using the class keyword
public class OOP {

    /*
    Access modifiers set the access level of classes, attributes, methods
    and constructors.
        1. Default: Accessible only by other classes in the same package
        2. Public: Accessible to all classes
        3. Protected: Accessible only to classes in the same package and
           its subclasses
        4. Private: Only accessible within the declared class
     */

    // Classes can only use either public or default.

    // Attributes are defined inside the class
    private boolean havingFun = false;          // Only accessible within class methods
    int age;                                  // Accessible anywhere, via objectName.age
    protected String name = "Jesse";                 // Only accessible in this package and by subclasses

    // Note: Trying to access objectName.havingFun will give a massive error, as it's private!
    // Same with objectName.name.

    // Static attributes are shared between all objects
    // They can also be accessed via the class, e.g. OOP.house
    static String house = "Mansion";

    // Methods are defined inside the class

    // The constructor is a special class that is run when an object is created
    // It is useful for populating objects. It cannot have a return type
    public OOP(int age, boolean havingFun) {
        // We can access other constructors using this(). It must be the first statement
        // in a constructor.
        this(age);

        // Override with havingFun input value if given
        this.havingFun = havingFun;


    }

    // We can have method overloading for constructors as well!
    public OOP(int age) {
        // Access object attributes in class methods via "this" keyword
        this.age = age;
        this.havingFun = !(age > 30);
    }

    // Static methods are called using the class name, e.g. OOP.testMethod()
    public static void testMethod() {

        // We create objects using the new keyword
        OOP testObject1 = new OOP(25);
        System.out.println("Do I enjoy OOP?: " + testObject1.havingFun);

        // Growing up :(
        testObject1.age += 1;

        // I am you, but BETTER (1 year younger)
        OOP testObject2 = new OOP(25);
        System.out.println(testObject1.age);
        System.out.println(testObject2.age);

    }

    // Non-static methods are called using an object
    public void setAge(int age) {
        this.age = age;
        System.out.println("Age changed to " + this.age);
    }


}