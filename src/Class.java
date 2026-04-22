

/**
 * Class.java: Demonstrates basic class structure and object creation
 *
 * This class illustrates core object-oriented programming principles:
 * - Encapsulation through data bundling
 * - Constructor-based object initialization
 * - Instance methods for data manipulation
 *
 * Purpose: Create and display person objects with basic attributes
 */
public class Class {
    // Instance variables (fields) - store data for each person object
    // These variables belong to each individual object created from this class
    String name;    // The person's full name
    int age;        // The person's age in years
    String email;   // The person's email address

    /**
     * Constructor: Creates a new Person object with specified details
     *
     * This is a special method called automatically when creating objects.
     * It initializes the object's fields with the provided values.
     *
     * @param name  The person's full name
     * @param age   The person's age in years
     * @param email The person's email address
     */
    public Class(String name, int age, String email) {
        // 'this' keyword refers to the current object being created
        // It distinguishes between the parameter and the instance variable
        this.name = name;    // Assign the name parameter to the name field
        this.age = age;      // Assign the age parameter to the age field
        this.email = email;  // Assign the email parameter to the email field
    }

    /**
     * Method: Prints the person's information to the console
     *
     * This instance method displays all the person's details.
     * It can access the object's fields directly.
     */
    public void display() {
        // Print each piece of information on a separate line
        System.out.println("Name: " + name);     // Display the name
        System.out.println("Age: " + age);       // Display the age
        System.out.println("Email: " + email);   // Display the email
    }
}
