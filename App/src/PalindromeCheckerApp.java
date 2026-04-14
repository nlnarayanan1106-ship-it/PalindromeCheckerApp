import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("=====================================");
        System.out.println("   Welcome to Palindrome Checker App ");
        System.out.println("=====================================");

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to lowercase to ignore case differences
        input = input.toLowerCase();

        // Remove all spaces from the string
        input = input.replaceAll(" ", "");

        // Variable to store reversed string
        String reversed = "";

        // Loop to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check if original string equals reversed string
        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("It is NOT a Palindrome ❌");
        }

        // Close scanner to avoid resource leak
        sc.close();
    }
}