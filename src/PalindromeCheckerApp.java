public class PalindromeCheckerApp {

    public static void main(String[] args) {


        // --------------------------------------
// UC6: Numeric Palindrome Check
// --------------------------------------

        java.util.Scanner scanner4 = new java.util.Scanner(System.in);

        System.out.print("UC6: Enter a number to check: ");
        int number = scanner4.nextInt();
        scanner4.nextLine(); // Consume newline

        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (reverse == number) {
            System.out.println("Result: " + number + " is a Numeric Palindrome\n");
        } else {
            System.out.println("Result: " + number + " is NOT a Numeric Palindrome\n");
        }
    }
}