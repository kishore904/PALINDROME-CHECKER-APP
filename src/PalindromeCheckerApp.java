import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC7: Deque-based optimized palindrome check
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("     UC7: DEQUE PALINDROME CHECKER    ");
        System.out.println("======================================\n");

        System.out.print("Enter a word to check using Deque: ");
        String input = scanner.nextLine();

        // Normalize input (keep only letters and numbers)
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // Deque for checking palindrome
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char ch : cleaned.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("\nResult: \"" + input + "\" is a Palindrome (Deque-Based)\n");
        } else {
            System.out.println("\nResult: \"" + input + "\" is NOT a Palindrome (Deque-Based)\n");
        }
    }
}