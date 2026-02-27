public class PalindromeCheckerApp {

    public static void main(String[] args) {


        // --------------------------------------
// UC5: Palindrome check ignoring spaces, punctuation and symbols
// --------------------------------------

        java.util.Scanner scanner3 = new java.util.Scanner(System.in);

        System.out.print("UC5: Enter a sentence to check (special chars will be ignored): ");
        String raw = scanner3.nextLine();

// Normalize input (keep only letters and numbers)
        String cleaned = raw.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String revCleaned = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(revCleaned)) {
            System.out.println("Result: \"" + raw + "\" is a Palindrome (after cleaning)\n");
        } else {
            System.out.println("Result: \"" + raw + "\" is NOT a Palindrome (after cleaning)\n");
        }

    } // END OF main()

} // END OF CLASS (THIS IS WHAT YOU MISSED)