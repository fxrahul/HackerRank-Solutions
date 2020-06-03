// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem

class Solution{


    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode copyh = head;
        int count = 0;
        while(copyh != null){
            count++;
            copyh = copyh.next;
        }

        // System.out.println("count: "+count);
        copyh = head;

        while(copyh.next != null){
            copyh = copyh.next;
        }

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        newNode.prev = copyh;
        newNode.next = null;
        copyh.next = newNode;



        for(int i = 0;i < count;i++){
            copyh = head;
            while(copyh.next != null){
                if(copyh.data > copyh.next.data){
                    int temp = copyh.data;
                    copyh.data = copyh.next.data;
                    copyh.next.data = temp;
                }
                copyh = copyh.next;
            }
        }

        return head;
    }


}