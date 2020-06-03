// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

class Solution{


    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode nextNodeh1 = null;
        SinglyLinkedListNode temp = null;

        while(head1!=null){
            nextNodeh1 = head1.next;
            head1.next = temp;
            head1 = nextNodeh1;
        }

        while(head2.next!=temp){
            head2 = head2.next;
        }

        // System.out.println("data: "+head2.data);
        return head2.data;


    }


}