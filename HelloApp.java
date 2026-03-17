public class HelloApp {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide first and last name");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];

        // Validate using regex
        if (!firstName.matches("[a-zA-Z]+") || !lastName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name. Only alphabets allowed.");
            return;
        }

        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}