
public class PalindromeCheckerApp {

    // -------------------------------------------------------
    // Algorithm 1: Two-Pointer Method
    // -------------------------------------------------------
    public static boolean twoPointerPalindrome(String input) {

        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // -------------------------------------------------------
    // Algorithm 2: Stack-based Palindrome
    // -------------------------------------------------------
    public static boolean stackPalindrome(String input) {

        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }

    // -------------------------------------------------------
    // Algorithm 3: Recursive Method
    // -------------------------------------------------------
    public static boolean recursivePalindrome(String cleaned, int left, int right) {

        if (left >= right)
            return true;

        if (cleaned.charAt(left) != cleaned.charAt(right))
            return false;

        return recursivePalindrome(cleaned, left + 1, right - 1);
    }

    // -------------------------------------------------------
    // main() — Measure execution time
    // -------------------------------------------------------
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("UC13: Performance Comparison of Palindrome Algorithms");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Clean once for recursion
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // -------------------------------------------------------
        // Measure time for Two-Pointer
        // -------------------------------------------------------
        long start1 = System.nanoTime();
        boolean r1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // -------------------------------------------------------
        // Measure time for Stack Method
        // -------------------------------------------------------
        long start2 = System.nanoTime();
        boolean r2 = stackPalindrome(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // -------------------------------------------------------
        // Measure time for Recursive Method
        // -------------------------------------------------------
        long start3 = System.nanoTime();
        boolean r3 = recursivePalindrome(cleaned, 0, cleaned.length() - 1);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // -------------------------------------------------------
        // Display Results
        // -------------------------------------------------------
        System.out.println("\n===== PERFORMANCE RESULTS =====");
        System.out.println("Two-Pointer Method : " + time1 + " ns");
        System.out.println("Stack Method       : " + time2 + " ns");
        System.out.println("Recursive Method   : " + time3 + " ns");
        System.out.println("================================\n");
    }
}