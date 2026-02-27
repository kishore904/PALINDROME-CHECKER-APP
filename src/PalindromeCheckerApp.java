public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome message
        System.out.println("======================================");
        System.out.println("     PALINDROME CHECKER APPLICATION    ");
        System.out.println("======================================");
        System.out.println("Version : 1.0");
        System.out.println("Author  : Kishore Kumar");
        System.out.println("--------------------------------------");
        System.out.println("This application checks if a string is");
        System.out.println("a palindrome. Let's begin!");
        System.out.println("--------------------------------------\n");

        // --------------------------------------
        // UC2: Hardcoded palindrome check (PUT HERE)
        // --------------------------------------
        String word = "MADAM";
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("UC2: Checking hardcoded word...");
        System.out.println("Input Word: " + word);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Result: " + word + " is a Palindrome\n");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome\n");
        }
    }
}
