import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Welcome to Palindrome Checker App ");
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("It is NOT a Palindrome ❌");
        }

        sc.close();
    }
}