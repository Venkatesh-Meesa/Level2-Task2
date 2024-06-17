import java.util.Scanner;

public class Pass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password Strength Checker");
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int length = password.length();
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Check each character in the password
        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        // Determine strength based on criteria
        int strengthScore = 0;
        if (length >= 8) {
            strengthScore++;
        }
        if (hasUppercase) {
            strengthScore++;
        }
        if (hasLowercase) {
            strengthScore++;
        }
        if (hasDigit) {
            strengthScore++;
        }
        if (hasSpecial) {
            strengthScore++;
        }

        // Provide feedback based on strength score
        System.out.print("Password Strength: ");
        if (strengthScore < 3) {
            System.out.println("Weak");
        } else if (strengthScore < 5) {
            System.out.println("Moderate");
        } else {
            System.out.println("Strong");
        }

        scanner.close();
    }
}
