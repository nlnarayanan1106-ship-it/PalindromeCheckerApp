import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Welcome to Palindrome Checker App ");
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("It is NOT a Palindrome ❌");
        }

        sc.close();
    }
}