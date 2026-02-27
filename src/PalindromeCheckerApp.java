public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert string to linked list
    public static Node convertToLinkedList(String input) {
        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Reverse a linked list (in-place)
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev; // new head
    }

    // UC8: Linked List Palindrome Checker
    public static boolean isPalindromeUsingLinkedList(String input) {

        // Step 1: Convert input string to linked list
        Node head = convertToLinkedList(input);

        // Step 2: Use fast–slow pointer to reach middle
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // moves 1 step
            fast = fast.next.next; // moves 2 steps
        }

        // Step 3: Reverse second half of the list
        Node secondHalfHead = reverse(slow);

        // Step 4: Compare first and second half
        Node firstPointer = head;
        Node secondPointer = secondHalfHead;

        while (secondPointer != null) {
            if (firstPointer.data != secondPointer.data) {
                return false;
            }
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return true;
    }

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("UC8: Linked List Based Palindrome Checker");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        if (isPalindromeUsingLinkedList(input)) {
            System.out.println("Result: " + input + " is a Palindrome (Linked List Method)");
        } else {
            System.out.println("Result: " + input + " is NOT a Palindrome (Linked List Method)");
        }
    }
}
