public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide your name.");
            return;
        }

        String name = args[0];

        // check if name contains only letters
        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name. Please enter alphabet characters only.");
            return;
        }

        System.out.println("Hello, " + name + "!");
    }
}