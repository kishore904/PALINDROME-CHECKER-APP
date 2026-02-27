
public class PalindromeCheckerApp {

    // ----------------------------------------
    // UC11: Palindrome Checker Service (OOPS)
    // Encapsulation + Single Responsibility Principle
    // ----------------------------------------
    static class PalindromeCheckerService {

        // Exposed method: check palindrome
        public boolean checkPalindrome(String input) {

            // Normalize: remove non-alphanumeric + lowercase
            String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

            int left = 0;
            int right = cleaned.length() - 1;

            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) {
                    return false; // Mismatch → not palindrome
                }
                left++;
                right--;
            }

            return true; // Palindrome
        }
    }

    // ----------------------------------------
    // main() — Calls the OOPS service
    // ----------------------------------------
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.print("Enter a string: ");

        String raw = scanner.nextLine();

        // Create service object
        PalindromeCheckerService service = new PalindromeCheckerService();

        // Call the OOPS method
        boolean result = service.checkPalindrome(raw);

        if (result) {
            System.out.println("Result: \"" + raw + "\" is a Palindrome (OOPS Method)");
        } else {
            System.out.println("Result: \"" + raw + "\" is NOT a Palindrome (OOPS Method)");
        }
    }
}