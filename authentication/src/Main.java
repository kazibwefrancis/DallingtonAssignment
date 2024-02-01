import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for password
        System.out.println("Enter Password:");
        int password = scanner.nextInt();
        scanner.nextLine(); // Consume newline left after nextInt()

        // Prompt for username
        System.out.println("Enter Username:");
        String enteredName = scanner.nextLine();

        // Check if username is correct
        boolean isNameCorrect = enteredName.equalsIgnoreCase("Francis");

        // Check if password is correct
        boolean isPasswordCorrect = (password == 1234567);

        // Output result
        if (isNameCorrect && isPasswordCorrect) {
            System.out.println("Successful Login");
        } else {
            System.out.println("Access Denied");
        }
    }
}
