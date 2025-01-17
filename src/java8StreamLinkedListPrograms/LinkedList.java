package java8StreamLinkedListPrograms;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Optional;

public class LinkedList {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one element, no cycle
        }

        ListNode slow = head;  // The tortoise (slow pointer)
        ListNode fast = head;  // The hare (fast pointer)

        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;            // Move slow pointer one step
            fast = fast.next.next;       // Move fast pointer two steps

            // If slow and fast pointers meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // If we reach here, no cycle exists
        return false;
    }

    // Helper method to print the list using Optional to handle null safely
    public void printList(ListNode head) {
        Optional.ofNullable(head)
                .ifPresent(node -> {
                    ListNode temp = node;
                    while (temp != null) {
                        System.out.print(temp.val + " ");
                        temp = temp.next;
                    }
                    System.out.println();
                });
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // Introduce a cycle: 5 -> 3 (cycle starts at node with value 3)
        head.next.next.next.next.next = head.next.next;

        // Check for cycle
        System.out.println("Does the linked list have a cycle? " + list.hasCycle(head));

        // Create another linked list without a cycle: 1 -> 2 -> 3 -> 4
        ListNode headNoCycle = new ListNode(1);
        headNoCycle.next = new ListNode(2);
        headNoCycle.next.next = new ListNode(3);
        headNoCycle.next.next.next = new ListNode(4);

        // Check for cycle
        System.out.println("Does the linked list have a cycle? " + list.hasCycle(headNoCycle));
    }
}
