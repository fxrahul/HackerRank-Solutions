// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem



// Complete the insertNodeAtPosition function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
class Solution {
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            SinglyLinkedListNode currentNode = head;
            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            if (position == 0) {
                newNode.next = currentNode;
                head = newNode;
            } else if (currentNode.next == null) {
                currentNode.next = newNode;
                newNode.next = null;
            } else {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
        return head;
    }
}

