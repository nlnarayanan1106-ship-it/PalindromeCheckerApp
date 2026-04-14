import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=====================================");
        System.out.println("   Welcome to Palindrome Checker App ");
        System.out.println("=====================================");

        // Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces
        input = input.toLowerCase().replaceAll(" ", "");

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("It is NOT a Palindrome ❌");
        }

        sc.close();
    }
}