
public class PalindromeCheckerApp {

    // -------------------------------------------------------
    // UC12: Strategy Interface
    // -------------------------------------------------------
    interface PalindromeStrategy {
        boolean isPalindrome(String input);
    }

    // -------------------------------------------------------
    // Strategy 1: Stack-based Palindrome Check
    // -------------------------------------------------------
    static class StackStrategy implements PalindromeStrategy {

        @Override
        public boolean isPalindrome(String input) {

            String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            java.util.Stack<Character> stack = new java.util.Stack<>();

            // Push all characters to stack
            for (char c : cleaned.toCharArray()) {
                stack.push(c);
            }

            // Build reversed string
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            return cleaned.equals(reversed.toString());
        }
    }

    // -------------------------------------------------------
    // Strategy 2: Deque-based Palindrome Check
    // -------------------------------------------------------
    static class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean isPalindrome(String input) {

            String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

            // Add characters to deque
            for (char c : cleaned.toCharArray()) {
                deque.addLast(c);
            }

            // Compare front-back until empty
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    // -------------------------------------------------------
    // main() — Choose strategy at runtime
    // -------------------------------------------------------
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("UC12: Strategy Pattern Based Palindrome Checker");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nChoose Palindrome Checking Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.isPalindrome(input);

        if (result) {
            System.out.println("\nResult: \"" + input + "\" is a Palindrome (Using Strategy Pattern)");
        } else {
            System.out.println("\nResult: \"" + input + "\" is NOT a Palindrome (Using Strategy Pattern)");
        }
    }
}