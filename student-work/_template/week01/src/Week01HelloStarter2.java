import java.util.Scanner; // Import the Scanner class so we can read user input

public class Week01HelloStarter2 { // Create a Java class named Week01HelloStarter2

    public static void main(String[] args) { // Main method: Java starts here
        Scanner input = new Scanner(System.in); // Create a Scanner object to read keyboard input

        System.out.print("Enter your name: "); // Ask the user to type their name
        String name = input.nextLine(); // Read the entire line of text and store it in name

        System.out.print("Enter one thing you want to learn in Java: "); // Ask for a Java learning goal
        String goal = input.nextLine(); // Read the goal and store it in the variable goal

        System.out.println("Hello, " + name + "!"); // Print a greeting using the name entered by the user
        System.out.println("Your Java goal is: " + goal); // Print the Java goal they entered
        System.out.println("Nice to meet you! Welcome to Java programming."); // Print a friendly closing message

        input.close(); // Close the Scanner to free up system resources
    }
}
