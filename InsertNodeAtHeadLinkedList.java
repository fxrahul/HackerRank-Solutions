// https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem

class Solution{


    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        //if list is empty
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = null;
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;

        }
        return head;

    }


}