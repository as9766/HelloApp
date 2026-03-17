public class HelloApp {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide first and last name");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];

        // Get initials
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Initials: " + firstInitial + "." + lastInitial);
    }
}