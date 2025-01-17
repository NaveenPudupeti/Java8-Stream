package java8StreamLinkedListPrograms;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.LinkedList;
import java.util.Optional;

public class ReverseLinkedList {

    public ListNode reverseRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head; // base case: empty list or single node
        }

        ListNode restReversed = reverseRecursively(head.next); // reverse the rest of the list
        head.next.next = head;  // reverse the current node's pointer
        head.next = null;       // set the next of the current node to null

        return restReversed; // return the new head of the reversed list
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original list: ");
        list.printList(head);

        ListNode reversedHead = list.reverseRecursively(head);

        System.out.print("Reversed list: ");
        list.printList(reversedHead);
    }
}
