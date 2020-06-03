// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem



// Complete the insertNodeAtTail function below.

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
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = null;
        }

        // while(currentNode.next !=null){
        //     currentNode = currentNode.next;
        // }


        //   currentNode.next = newNode;


        return head;


    }
}

