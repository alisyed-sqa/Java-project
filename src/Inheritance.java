// Inheritance.java: Demonstrates inheritance in Java
// Inheritance allows one class to inherit the properties and methods of another class

public class Inheritance {

    public static void demonstrateInheritance() {
        System.out.println("\n--- Inheritance Demo ---");

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  protected String modelName = "Mustang";    // Car attribute
}