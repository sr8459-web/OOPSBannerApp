package Hello_App;

public class HelloWorldUC5 {
public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            // Default Message if no arguments
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use StringBuilder to build the name list efficiently
            StringBuilder namesList = new StringBuilder();

            // Step 3: Enhanced For Loop (For-Each) to iterate through args
            for (String name : args) {
                // If the StringBuilder is not empty, add a comma and space first
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }

            // Step 4: Print the final concatenated greeting
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}
