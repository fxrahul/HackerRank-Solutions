// https://www.hackerrank.com/challenges/compare-two-linked-lists/problem

class Solution{


    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int countForLL1 = 0;
        int countForLL2 = 0;
        int flag = 1;
        SinglyLinkedListNode copyhead1= head1;
        SinglyLinkedListNode copyhead2= head2;

        while(copyhead1!=null){
            copyhead1 = copyhead1.next;
            countForLL1 += 1;
        }
        while(copyhead2!=null){
            copyhead2 = copyhead2.next;
            countForLL2 += 1;
        }

        if (countForLL1 != countForLL2){
            flag = 0;
        }else{
            while(head1 != null){
                if(head1.data != head2.data){
                    flag = 0;
                    break;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        if (flag == 1){
            return true;
        }else{
            return false;
        }
    }


}