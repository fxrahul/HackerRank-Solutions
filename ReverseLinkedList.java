// https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

class Solution{


    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */


    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode nextNode = null ;
        SinglyLinkedListNode prevNode = null ;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        head = prevNode;
        return head;

    }


}