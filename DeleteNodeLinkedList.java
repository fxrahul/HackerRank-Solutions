// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem

class Solution{


    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode currentNode = head;


        if(position == 0){
            currentNode = currentNode.next;
            head = currentNode;
        }else {
            for(int i=0;i<position-1;i++){
                currentNode = currentNode.next;
            }
            SinglyLinkedListNode nextNode = currentNode.next;
            if(nextNode.next == null){
                currentNode.next = null;
            }else{
                currentNode.next = nextNode.next;
            }

        }
        return head;

    }


}