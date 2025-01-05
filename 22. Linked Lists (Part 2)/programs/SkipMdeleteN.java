import java.util.*;

class SkipMdeleteN {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head;

        while (curr != null) {
            // Skip M nodes
            for (int count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }

            if (curr == null) {
                return;
            }

            // Delete N nodes
            Node temp = curr.next;
            for (int count = 1; count <= N && temp != null; count++) {
                temp = temp.next;
            }

            // Connect the current node to the next part of the list
            curr.next = temp;
            curr = temp;
        }

// Problem Recap:
// Retain the first M nodes, delete the next N nodes, and repeat until the end of the list.
// Input Example:
// Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
// earlier i was not using while loop
// In the previous solution, the code skips M nodes and deletes N nodes once, but it doesn’t repeat this process for the remaining nodes in the linked list. It essentially processes the first segment (M + N nodes) but stops there.

// Execution of the Previous Solution:
// Start with curr = head, pointing to 1.
// Skip M Nodes:
// Move curr 2 steps forward (curr now points to 2).
// Delete N Nodes:
// Start deleting 2 nodes after curr. The nodes 3 and 4 are removed.
// curr.next is updated to skip these deleted nodes. The list becomes:

// 1 -> 2 -> 5 -> 6 -> 7 -> 8
// The function ends because there is no loop to continue processing the remaining nodes (5 -> 6 -> 7 -> 8).
// Output of the Previous Solution:

// 1 -> 2 -> 5 -> 6 -> 7 -> 8
// This is incorrect because it didn't process the segment starting from 5.

// Correct Solution with while (curr != null):
// The key issue is that the logic must repeat for every remaining segment of the linked list until we reach the end. This is achieved by the while (curr != null) loop, which ensures that the process (skip M and delete N) continues until the entire linked list is processed.

// Execution of the Correct Solution:
// Start with curr = head, pointing to 1.

// First Segment:

// Skip M Nodes: Move curr 2 steps forward (curr now points to 2).
// Delete N Nodes: Remove 3 and 4. Update curr.next to skip these nodes. List becomes:

// 1 -> 2 -> 5 -> 6 -> 7 -> 8
// Update curr to point to 5.
// Second Segment:

// Skip M Nodes: Move curr 2 steps forward (curr now points to 6).
// Delete N Nodes: Remove 7 and 8. Update curr.next to skip these nodes. List becomes:

// 1 -> 2 -> 5 -> 6
// Update curr to null (end of the list).
// The loop ends because curr == null.

// Output of the Correct Solution:
// 1 -> 2 -> 5 -> 6
    }

    public static void main(String args[]) {
        SkipMdeleteN list = new SkipMdeleteN();
        int M = 2, N = 2;

        // Creating the linked list: 1->2->3->4->5->6->7->8
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.printf("M = %d, N = %d \n" + "Linked list we have is :\n", M, N);
        print(list.head);

        skipMdeleteN(list.head, M, N);

        System.out.printf("\nLinked list after deletion is :\n");
        print(list.head);
        // Expected output: 1 2 5 6
    }
}
