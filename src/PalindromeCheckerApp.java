public class PalindromeCheckerApp {

    // ----------------------------------------
    // UC10: Case-Insensitive & Space-Ignored Palindrome Checker
    // ----------------------------------------
    public static boolean isCaseInsensitivePalindrome(String input) {

        // Step 1: Normalize string (remove spaces, convert to lowercase)
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer method
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome Checker");
        System.out.print("Enter a string: ");

        String raw = scanner.nextLine();

        boolean result = isCaseInsensitivePalindrome(raw);

        if (result) {
            System.out.println("Result: \"" + raw + "\" is a Palindrome (Case & Space Ignored)");
        } else {
            System.out.println("Result: \"" + raw + "\" is NOT a Palindrome (Case & Space Ignored)");
        }
    }
}