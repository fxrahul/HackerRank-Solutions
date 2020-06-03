// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem

class Solution{


    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {



        SinglyLinkedListNode copyh1 = head1;

        // Joining two linkedList
        while(head1.next != null){
            head1 = head1.next;
        }
        head1.next = head2;

        head1 = copyh1;



        int countForLL1 = 0;
        SinglyLinkedListNode copyhead1= head1;
        while(copyhead1!=null){
            copyhead1 = copyhead1.next;
            countForLL1 += 1;
        }



        for(int i=0;i<countForLL1;i++){
            copyhead1 = head1;
            while(copyhead1.next != null){
                if(copyhead1.data > copyhead1.next.data){
                    int temp = copyhead1.data;
                    copyhead1.data = copyhead1.next.data;
                    copyhead1.next.data = temp;
                }
                copyhead1 = copyhead1.next;
            }

        }

        return head1;

    }


}