// UC2: Display Hello with Command-Line Argument
// This program reads the user's name from command-line arguments
// and prints a personalized greeting message.

public class HelloWorldUC2 {

    // Entry point of the Java program
    public static void main(String[] args) {

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {

            // Retrieve the first argument as the user's name
            String name = args[0];

            // Display personalized greeting
            System.out.println("Hello, " + name + "!");

        } else {

            // Default message if no argument is given
            System.out.println("Hello, World!");

        }
    }
}