// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
class Solution{


    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        SinglyLinkedListNode copyHead = head;
        int count = 0;

        while(copyHead!=null){
            copyHead = copyHead.next;
            count++;
        }
        int positionToFind = count - positionFromTail;
        int i = 1;
        while(i != positionToFind){
            i++;
            head = head.next;
        }
        // System.out.print(head.data);
        return head.data;
    }


}