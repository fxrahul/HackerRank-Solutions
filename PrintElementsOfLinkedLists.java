// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem



// Complete the printLinkedList function below.

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
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode;
        currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }
}

