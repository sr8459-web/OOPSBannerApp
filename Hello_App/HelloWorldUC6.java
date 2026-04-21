package Hello_App;

public class HelloWorldUC6 {
{
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Step 2: Enhanced For Loop - Appends delimiter to EVERY entry
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 3: Remove the trailing ", " (last 2 characters)
            // Defensive check ensures we don't call substring on an empty string
            String finalNames = "";
            if (nameBuilder.length() > 0) {
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Step 4: Output the result
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}
}   
