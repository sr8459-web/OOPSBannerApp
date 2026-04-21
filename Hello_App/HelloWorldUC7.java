package Hello_App;

public class HelloWorldUC7 {
{
    public static void main(String[] args) {
        // Step 1: Handle the default case (zero arguments)
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use String.join to merge all array elements
            // Delimiter: ", "
            // Elements: args array
            String joinedNames = String.join(", ", args);

            // Step 3: Print the final formatted greeting
            System.out.println("Hello, " + joinedNames + "!");
        }
    }
}
}
