/**
 * Controls.java: Demonstrates various control structures in Java
 *
 * This class showcases fundamental programming constructs that control
 * the flow of execution in Java programs. Understanding these structures
 * is essential for writing effective and efficient code.
 *
 * Control structures demonstrated:
 * - Conditional statements (if-else, switch)
 * - Loops (for, while)
 * - Exception handling (try-catch-finally)
 */
public class Controls {

    /**
     * Demonstrates if-else if-else conditional control structure
     *
     * This method shows how to make decisions based on conditions.
     * The program evaluates each condition in order and executes
     * the first true condition's block.
     */
    public static void demonstrateIfElse() {
        // Example scenario: Grading system based on test score
        int score = 75;  // Sample test score to evaluate

        // Check score ranges and assign appropriate grade
        if (score >= 90) {          // Excellent performance
            System.out.println("Grade: A");
        } else if (score >= 80) {   // Good performance
            System.out.println("Grade: B");
        } else if (score >= 70) {   // Satisfactory performance
            System.out.println("Grade: C");
        } else {                    // Needs improvement
            System.out.println("Grade: F");
        }
        // Expected output: "Grade: C" (since 75 falls in 70-79 range)
    }

    /**
     * Demonstrates switch statement for multi-way branching
     *
     * Switch statements are efficient alternatives to long if-else chains
     * when comparing a single value against multiple constants.
     */
    public static void demonstrateSwitch() {
        // Example: Determine message based on day of the week
        String day = "Monday";  // Day to check

        // Evaluate the day and provide appropriate response
        switch (day) {
            case "Monday":        // Start of work week
                System.out.println("Start of work week");
                break;            // Exit switch after executing this case
            case "Friday":        // End of work week
                System.out.println("End of work week");
                break;
            case "Saturday":      // Weekend days
            case "Sunday":        // Both Saturday and Sunday execute same code
                System.out.println("Weekend!");
                break;
            default:              // Any day not explicitly handled above
                System.out.println("Regular day");
        }
        // Expected output: "Start of work week"
    }

    /**
     * Demonstrates for loops (both traditional and enhanced for-each)
     *
     * For loops are used when you know exactly how many times to repeat.
     * The enhanced for-each loop is particularly useful for arrays and collections.
     */
    public static void demonstrateForLoops() {
        // Traditional for loop: Execute a specific number of times
        System.out.println("Traditional for loop:");
        for (int i = 0; i < 5; i++) {  // i goes from 0 to 4 (5 iterations)
            System.out.println("Test run #" + (i + 1));
        }

        // Enhanced for-each loop: Iterate over each element in a collection
        System.out.println("\nEnhanced for-each loop:");
        String[] testCases = {"Login", "Logout", "Search", "Register"};
        for (String tc : testCases) {  // tc takes each value in testCases array
            System.out.println("Running: " + tc);
        }
    }

    /**
     * Demonstrates while loop for conditional repetition
     *
     * While loops continue executing as long as a condition remains true.
     * They are ideal when you don't know exactly how many iterations are needed.
     */
    public static void demonstrateWhileLoop() {
        // Example: Retry an operation up to 3 times
        int attempts = 0;              // Counter for attempts made

        // Continue while attempts is less than 3
        while (attempts < 3) {         // Loop condition: keep going while attempts < 3
            System.out.println("Attempt " + (attempts + 1));
            attempts++;                // Increment counter after each attempt
        }
        // Output: Attempt 1, Attempt 2, Attempt 3, then loop ends
    }

    /**
     * Demonstrates exception handling with try-catch-finally
     *
     * Exception handling allows programs to gracefully recover from
     * unexpected errors rather than crashing. The finally block always
     * executes, regardless of whether an exception occurred.
     */
    public static void demonstrateExceptionHandling() {
        // Attempt to execute potentially problematic code
        try {
            // This will intentionally cause an exception (division by zero)
            int result = 10 / 0;  // ArithmeticException will be thrown
            System.out.println(result);  // This line won't execute

        } catch (ArithmeticException e) {
            // Handle the specific type of exception that occurred
            System.out.println("Error caught: " + e.getMessage());

        } finally {
            // This block ALWAYS executes, even if an exception occurred
            // Useful for cleanup operations (closing files, releasing resources)
            System.out.println("This always runs, error or not");
        }
    }
}
