// ReadWriteFile.java: Demonstrates file input/output operations in Java
// This class shows how to write text to files and read text from files
// File I/O is essential for persisting data between program runs

import java.io.BufferedReader;  // Efficiently reads text line by line
import java.io.FileReader;      // Opens files for reading
import java.io.FileWriter;      // Opens files for writing
import java.io.IOException;     // Handles file operation errors

public class ReadWriteFile {

    // Method to demonstrate writing text to a file
    // This creates or overwrites a file with test results
    public static void demonstrateFileWriting() {
        // try-with-resources: Automatically closes the file when done
        // This prevents resource leaks and ensures files are properly closed
        try (FileWriter writer = new FileWriter("results.txt")) {

            // Write test results to the file, one line at a time
            writer.write("Test: Registration\n");     // \n creates a new line
            writer.write("Status: PH# required\n");
            writer.write("Test: Login\n");
            writer.write("Error: Invalid credentials\n");
            writer.write("Navigate: Home\n");
            writer.write("Status: PASS\n");

            System.out.println("File written successfully to results.txt!");

        } catch (IOException e) {
            // Handle any errors that occur during file writing
            System.out.println("Error writing file: " + e.getMessage());
        }
        // File is automatically closed here by try-with-resources
    }

    // Method to demonstrate reading text from a file
    // This reads the test results file we just created and displays them
    public static void demonstrateFileReading() {
        // try-with-resources with BufferedReader for efficient reading
        try (BufferedReader reader = new BufferedReader(
                              new FileReader("results.txt"))) {

            String line;  // Variable to hold each line as we read it
            System.out.println("Reading from results.txt:");

            // readLine() returns each line of text, or null when file ends
            // The loop continues until we reach the end of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Display each line we read
            }

            System.out.println("File reading completed!");

        } catch (IOException e) {
            // Handle any errors that occur during file reading
            System.out.println("Error reading file: " + e.getMessage());
        }
        // File is automatically closed here by try-with-resources
    }
}
