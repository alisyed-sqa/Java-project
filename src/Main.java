
// Main.java: Entry point of the program
// Demonstrates classes, control structures, interfaces, and file I/O

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Java program");

        // Create and display person objects
        Class person1 = new Class("John Doe", 30, "john@test.com");
        Class person2 = new Class("Ali", 25, "ali@servicemarket.com");
        Class person3 = new Class("Hassan", 28, "hassan@test.com");

        person1.display();
        person2.display();
        person3.display();

        // Demonstrate control structures
        System.out.println("\n--- Control Structures ---");
        Controls.demonstrateIfElse();
        Controls.demonstrateSwitch();
        Controls.demonstrateForLoops();
        Controls.demonstrateWhileLoop();
        Controls.demonstrateExceptionHandling();

        // Demonstrate interfaces
        System.out.println("\n--- Interfaces ---");
        InterfaceDemo.demonstrateInterfaces();

        // Demonstrate file I/O
        System.out.println("\n--- File I/O ---");
        ReadWriteFile.demonstrateFileWriting();
        ReadWriteFile.demonstrateFileReading();

        // Demonstrate encapsulation
        Encapsulation.demonstrateEncapsulation();

        // Demonstrate inheritance
        Inheritance.demonstrateInheritance();
    }
}
