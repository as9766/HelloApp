public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide your name");
            return;
        }

        String name = args[0];
        boolean valid = true;

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                valid = false;
                break;
            }
        }

        if (!valid) {
            System.out.println("Invalid name");
        } else {
            System.out.println("Hello, " + name);
        }
    }
}