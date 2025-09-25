package W3resourseBasic;

public class MergeTwoSortedLinkedLists {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge two sorted lists
    public static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        // Dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    // Print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Main function
    public static void main(String[] args) {
        // First sorted list: 1 -> 3 -> 7
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(7);

        // Second sorted list: 2 -> 9 -> 13 -> 40
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(13);
        l2.next.next.next = new ListNode(40);

        // Merge the lists
        ListNode mergedList = mergeSortedLists(l1, l2);

        // Output
        System.out.print("Merge Two Sorted Lists:\n");
        printList(mergedList);
    }
}
