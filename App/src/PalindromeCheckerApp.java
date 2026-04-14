import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Welcome to Palindrome Checker App ");
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome ✅");
        } else {
            System.out.println(word + " is NOT a Palindrome ❌");
        }

        sc.close();
    }
}