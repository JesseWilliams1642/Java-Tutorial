// Java, owned by Oracle, was made in 1995
// It is used in mobile (especially Android apps), Desktop and Web applications.
// It is also used in web servers, applications servers, games, database connections, and more!

/*
Java is widely used because:
    * Works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc)
    * Open-source and free
    * Easy to learn and simple to use
    * Secure, fast and powerful
 */

// Java is an object-oriented language, which gives a clear structure to programs
// and allows code to be reused, lowering development costs

// The class of a file must match the file name, e.g. Main class must be in Main.java

// To compile Java files, we use
//      javac <File Name>
// To run Java files, we use
//      java <File Name>

// In the Main class, we must have a main() function. This is executed whenever a Java
// file is executed.

public class Main {

    /*
    Function declarations have the format:
        1. Class access modifiers
        2. Static (Optional)
        3. Function return type
        4. Function name
        5. Function arguments
    */
    public static void main(String[] args) {
        System.out.println("Time to learn Java quickly!");
        System.out.print("This line is made of two print statements, ");
        System.out.print("as only println adds \\n automatically at the end.\n\n");

        // Note: Variable names are called "Identifiers". They cannot start with a number,
        // and cannot correspond to existing Java keywords, e.g. int or boolean.
        int age = 25;
        String name = "Jesse";

        System.out.println(name + " is " + age + " years old. " +
                "In two years they will be " + (age * 2) + ".");

        // A print statement without a string will simply perform calculations
        System.out.println(age + age);

        // A print statement with a string will concatenate the numbers as strings,
        // unless they are wrapped in brackets (that is, you must do what was done
        // with (age * 2)).
        System.out.println("Jesse is not " + age + age + ".");

        // Constant values are denoted by the "final" keyword
        // Conventionally, constants are usually full uppercase
        final int FOREVER_21 = 21;

        /*
        Primitive data types specify the variable type and what values it can hold
            * byte      : Whole numbers from -128 to 127
            * short     : Whole numbers from -32,768 to 32,767
            * int       : Whole numbers from -2,147,483,648 to 2,147,483,647
            * long      : Whole numbers from -9,223,372,035,854,775,808 to 9,223,372,035,854,775,807
            * float     : Fractions to 6-7 decimal places
            * double    : Fractions to 15-16 decimal places
            * boolean   : True or false (0 or 1)
            * char      : Stores a single character/letter or ASCII values
        */

        byte smidgeNumber = -1;
        short smallishNumber = 12000;

        // Floating point and double numbers can also be in scientific notation
        // Doubles are safer to use in calculations due to their higher precision

        // When defining a float or double, you should add f or d at the end
        // Decimal values are interpreted as double by default!

        double smallDouble = 0.087;
        // float smallFloat = 3.21e-10;     // Would error
        float smallFloat = 3.21e-10f;
        double largeDecimal = 3.21e3d;

        // Characters store a single character. It always can work through ASCII
        // numeric values (https://www.ascii-code.com/)
        char myGrade = 'S';
        char yourGrade = 67;        // C in ASCII

        /*
        Non-primitive data types are built on one or more primitive types
            * String        : A collection of characters
            * Array         : An array of a single datatype
            * Classes       : A blueprint of an object, describing its attributes and methods
        */
        // Non-primitive types always start with an Uppercase letter
        // Non-primitive types can be null

        // The var keyword lets the compiler automatically detect the variable type
        // based on what is assigned to it
        var x = 5;      // Assigned as an int
        var d = 'D';    // Assigned as a char

        /*
        Java Type Casting means converting one data type to another. In Java
        there are two main types of casting

            * Widening Casting (Automatic): Converts a smaller type to a larger type
                byte -> short -> char -> int -> long -> float -> double

            * Narrowing Casting (Manual): Converts a larger type to a smaller type
                double -> float -> long -> int -> char -> short -> byte

        */

        // Widening casting is done automatically when passing a smaller size type
        // into a larger size type
        int oldInt = 5;
        double newDouble = oldInt;      // Becomes 5.0

        // Narrow casting is done through a parenthesis in front of the value
        // This may result in data loss
        double oldDouble = 10.6789;
        int newInt = (int) oldDouble;       // Becomes 10, losing the .6789 information

        /*
        Java operators include:

            * Arithmetic Operators (+, -, *, /)
                - Modulus % (gives division remainder)
                - Increment and decrement (++, --)

            * Assignment Operators (=, +=, -=, *=, /=, %=)
                - Bitwise assignment operators (&=, |=, ^=, >>=, <<=)

            * Comparison Operators (==, !=, <, >, >=, <=)

            * Logical Operators (&&, ||, !)

        */

        // Now for some string methods!
        String somethingToPlayWith = "   Hello there! General Kenobi ;)   ";
        short size = (short) somethingToPlayWith.length();

        // We can remove whitespace before and after a string using trim()
        somethingToPlayWith = somethingToPlayWith.trim();

        System.out.println(somethingToPlayWith.toUpperCase());
        System.out.println(somethingToPlayWith.toLowerCase());

        // indexOf returns the index of the first occurence of the specified text
        byte kenobiIndex = (byte) somethingToPlayWith.indexOf("Kenobi");

        // You can get specific characters by an index
        char kenobiCharacter = somethingToPlayWith.charAt(kenobiIndex);     // K

        // Two strings can be compared using .equals()
        String txt1 = "Hello";
        String txt2 = "Hello";
        System.out.println(txt1.equals(txt2));  // True

        // We can use the + operator, or the concat() method, to concatenate strings
        System.out.println(txt1 + " " + txt2);
        System.out.println(txt1.concat(" ").concat(txt2));

        int iLoveYou = 9000;
        String quote = txt1 + " x" + iLoveYou;   // Automatic conversion

        /*
        Special characters include:
            * \'        : Single quotation '
            * \"        : Double quotation "
            * \\        : Backslash \

            * \n        : New line
            * \t        : Tab
            * \b        : Backspace
            * \r        : Carriage Return
            * \f        : Form Feed

        */

        // The Java Math class has many methods for mathematical operations
        int num1 = 5;
        int num2 = 22;
        int num3 = 25;
        double num4 = -10.32;

        System.out.println(Math.max(num1,num2));
        System.out.println(Math.min(num1,num2));
        System.out.println(Math.sqrt(num3));
        System.out.println(Math.abs(num4));
        System.out.println(Math.pow(num1,3));

        /*
        Java also has multiple methods for rounding numbers
            * Math.round()      : Rounds to the nearest integer (note 0.5 -> 1)
            * Math.ceil()       : Rounds up
            * Math.floor()      : Rounds down

        */
        float someFloat = 12.34f;

        long roundedDouble = Math.round(num4);           // -10.0
        int roundedFloat = Math.round(someFloat);        // 12
        System.out.println(Math.round(12.5));            // 13

        System.out.println(Math.ceil(-20.4));       // -20
        System.out.println(Math.floor(-20.4));      // -21

        System.out.println(Math.ceil(5.7));         // 6
        System.out.println(Math.floor(5.7));        // 5

        // We can generate a random number between 0.0 <= x < 1.0 using Math.random()
        double rand = Math.random();        // RETURNS A DOUBLE!
        int score = (int)(rand * 101);      // 0 to 100, inclusive

        // Boolean
        boolean alwaysSunnyIsGood = true;
        System.out.println("Is Always Sunny In Philadelphia a good show?: " + alwaysSunnyIsGood);

        if (!alwaysSunnyIsGood) {
            System.out.println("THROW IT IN THE TRASH!");
        } else {
            System.out.println("Time to rewatch it!");
        }

        // Logical operations include >, <, ==, &&, || and !

        // We can use a shorthand form of if-statement
        int numNuggies = 20;
        String feelsSick = (numNuggies > 10) ? "Yes" : "No";

        // Switch statements are more compact if statements
        // A break is required, else it will continue checking other statements
        int numDroids = 5;

        switch(numDroids) {
            case 1:
            case 2:     // For larger ranges, use an if statement
            case 3:
            case 4:
            case 5:
                System.out.println("This is a handlable amount of droids!");
                break;
            case 6:
                System.out.println("This is getting a little out of hand...");
                break;
            default:
                System.out.println("This is getting out of hand!");
        }

        // While statements are ez pz
        int i = 0;
        while (i < 5) {
            System.out.print(i++);
        }
        System.out.println();

        // Do-while loops are good for if you need it to be run at least once
        do {
            System.out.print(i--);
        } while (i > 0);
        System.out.println();

        // For loops are straight forward
        for (int j = 0; j < 10; j++) {

            if (j == 6)
                break;      // Terminates the for loop
                            // Would also terminate while and do-while

            if (j == 4)
                continue;   // Skips to the loop iteration
                            // Also works for while and do-while

            System.out.print(j);
        }
        System.out.println();

        // For-each loops loop through elements in an Array, Map, etc.
        String[] pokemons = { "Pikachu", "Charmander", "Bulbasaur" };
        for (String pokemon : pokemons)
            System.out.println(pokemon);

        // Arrays store multiple values of the same data type
        int[] numbers = { 0, 12, -3, 4 };
        System.out.println(numbers[2]);

        numbers[3] = -100;
        System.out.println(numbers.length);

        // You can create an empty Array with a specified size using the new keyword
        String[] skills = new String[5];
        skills[0] = "Learning";
        skills[4] = "Perseverence";

        // Could also do String[] skills = new String[] { contents };

        // We can loop through arrays through for-looping or while-looping through
        // indexes, or by using for-each

        // for (int j = 0; j < 5; j++)
        //      System.out.println(skills[j]);

        for (String skill : skills)
            System.out.print(skill + " ");
        System.out.println();

        // We can also have multi-dimensional arrays
        int[][] matrix = { {1, 4, 2}, {3, 6, 8} };
        System.out.println(matrix[1][2]);
        matrix[1][1] = 10;

        // We can get the number of rows and columns through .length
        // Of course, the number of values in each array does not need to match!
        int[][] notMatrix = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        System.out.println("Rows: " + notMatrix.length);                // 2
        System.out.println("Cols in row 0: " + notMatrix[0].length);    // 3
        System.out.println("Cols in row 1: " + notMatrix[1].length);    // 5

        // A method/function must be declared within a class
        // Static means it belongs to the class it is within (must call it via
        // Main.learningMethods() if called outside of this class definition)

        boolean pushedReallyHard = learningMethods(200,"Jesse");

        // Void return type means nothing should be returned

        sayTheLineBart(1);

        // Method overloading is where you have multiple methods with the
        // same method name, but with differing parameters
        // When you call a method, the method that corresponds to the parameters
        // you have entered is chosen

        int intSum = plusMethod(8, 5);
        double doubleSum = plusMethod(4.3, 6.26);
        System.out.println("Int Sum: " + intSum);
        System.out.println("Double Sum: " + doubleSum);

        /*
        Everything within {} is scoped. This is the same for {} for functions
        and loops. Variables set inside a scope cannot be accessed outside of it.
        */

        // You can scope using {} even within function or loops
        {
            int scopedX = 0;
        }
        // System.out.println(scopedX);         // WILL ERROR! OUT OF SCOPE!

        // This scoping is the reason why we can reuse j as the loop
        // index for our for loops

        // Recursion is where a method calls itself
        System.out.println("Factorial of 5 is " + factorial(5));

        // You must be careful so that recursive functions you create
        // do not perform infinite recursion

        // Now we will look at OOP!
        System.out.println("================ OOP Learning ================");

        // Public classes stored inside of the same directory can access
        // each other without needing specific imports
        OOP.testMethod();
        System.out.println("We all live in a " + OOP.house);

        OOP user = new OOP(30, false);
        user.setAge(40);

        System.out.println("\n================ Inheritance Learning ================");
        InheritanceTest inheritanceObject = new InheritanceTest(new String[]{"Bridgerton", "Second Date Update"});
        inheritanceObject.listShows();

        inheritanceObject.setBeverage();
        String bev = inheritanceObject.getBeverage();

        inheritanceObject.isAbstract();

        // Regular inner classes must first reference the outer class
        InheritanceTest.InnerClassTest coolNumberRepo = inheritanceObject.new InnerClassTest();
        coolNumberRepo.refreshed();

        // Static inner classes only require the outer class name
        InheritanceTest.StaticInnerClassGoBrrr brrNumber = new InheritanceTest.StaticInnerClassGoBrrr();


    }

    // METHODS CANNOT BE DEFINED IN OTHER METHODS!!!!!

    // Method w/ arguments example
    static boolean learningMethods(int impactFactor, String name) {
        System.out.println(name + " just got pushed with the force of " + impactFactor + "N!");

        if (impactFactor > 100) return true;
        return false;
    }

    // Void return type example
    static void sayTheLineBart(int index) {
        System.out.println("Say the line, Bart!");
        if (index == 1) {
            System.out.println("YAY!!!!");
            return;     // Stops the function at this point
        }
        System.out.println("AWWWW :(");

        // No return value is needed, so no return here is acceptable
        // return;
    }

    // Method overloading example
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Recursion example
    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

}