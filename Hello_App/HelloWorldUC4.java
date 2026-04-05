public class HelloWorldUC4 {
    public static void main(String[] args) {

        String output;

        if (args.length == 0) {
            output = "World";
        } else {
            output = String.join(", ", args);
        }

        System.out.println("Hello, " + output + "!");
    }
}