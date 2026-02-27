public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // --------------------------------------
// UC3: User input palindrome check
// --------------------------------------

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("UC3: Enter a word to check: ");
        String input = scanner.nextLine();

        String rev = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(rev)) {
            System.out.println("Result: " + input + " is a Palindrome\n");
        } else {
            System.out.println("Result: " + input + " is NOT a Palindrome\n");
        }
    }
}