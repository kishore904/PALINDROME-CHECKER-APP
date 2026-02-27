public class PalindromeCheckerApp {

    public static void main(String[] args) {


                java.util.Scanner scanner2 = new java.util.Scanner(System.in);
                String choice;

                do {
                    System.out.print("UC4: Enter a word to check: ");
                    String text = scanner2.nextLine();

                    String revText = new StringBuilder(text).reverse().toString();

                    if (text.equalsIgnoreCase(revText)) {
                        System.out.println("Result: " + text + " is a Palindrome\n");
                    } else {
                        System.out.println("Result: " + text + " is NOT a Palindrome\n");
                    }

                    System.out.print("Do you want to check another word? (yes/no): ");
                    choice = scanner2.nextLine();

                } while (choice.equalsIgnoreCase("yes"));

                System.out.println("\nUC4: Loop ended. Going back to menu or exiting...\n");
            } // END OF main()

        } // END OF CLASS