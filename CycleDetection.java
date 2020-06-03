// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem

class Solution{


    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */


    static boolean hasCycle(SinglyLinkedListNode head) {

        //Using temporary node for traversing!!!!!!
        // SinglyLinkedListNode copyHead = head;
        // SinglyLinkedListNode nextNode = null;

        // while(copyHead!=null){
        //     if(copyHead.next == null){
        //         return false;
        //     }
        //     if(copyHead.next == head){
        //         return true;
        //     }
        //     nextNode = copyHead.next;
        //     copyHead.next = head;
        //     copyHead = nextNode;
        // }

        // return false;

        //using floyd's slow fast pointer approach

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;


        while(slow!=null && fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }

        return false;

    }


}