// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem

class Solution{


    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode nextNode = null;
        SinglyLinkedListNode currentNode = head;
        int flag = 1;
        while(currentNode.next!=null){
            // System.out.print("check Outer");
            nextNode = currentNode.next;
            while(currentNode.data == nextNode.data){
                // System.out.print("check Inner");
                if(nextNode.next!=null){
                    currentNode.next = nextNode.next;
                    nextNode.next = null;
                    nextNode = currentNode.next;
                }else{

                    currentNode.next = null;
                    flag = 0;
                    break;
                }
            }
            if(flag == 0){
                break;
            }
            currentNode = currentNode.next;

        }


        return head;

    }


}