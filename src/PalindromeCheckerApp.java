public class PalindromeCheckerApp {

    // ----------------------------------------
    // UC9: Recursive Palindrome Check Function
    // ----------------------------------------
    public static boolean isPalindromeRecursive(String input, int left, int right) {

        // BASE CONDITION 1:
        // If left crosses right → all characters matched
        if (left >= right) {
            return true;
        }

        // BASE CONDITION 2:
        // If mismatch found → not a palindrome
        if (input.charAt(left) != input.charAt(right)) {
            return false;
        }

        // RECURSIVE CALL:
        // Move inward (left++, right--)
        return isPalindromeRecursive(input, left + 1, right - 1);
    }

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("UC9: Recursive Palindrome Checker");
        System.out.print("Enter a string: ");

        // Remove special characters & convert to lowercase
        String raw = scanner.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        boolean result = isPalindromeRecursive(raw, 0, raw.length() - 1);

        if (result) {
            System.out.println("Result: \"" + raw + "\" is a Palindrome (Recursive Method)");
        } else {
            System.out.println("Result: \"" + raw + "\" is NOT a Palindrome (Recursive Method)");
        }
    }
}