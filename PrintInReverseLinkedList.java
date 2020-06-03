// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem

class Solution{


    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        //simple approach
        // SinglyLinkedListNode currentNode = head;
        // ArrayList<Integer> a = new ArrayList<>();
        // if(head != null){
        //     while(currentNode.next != null){
        //         a.add(currentNode.data);
        //         currentNode= currentNode.next;
        //     }
        //  a.add(currentNode.data);
        // }
        // int l = a.size()-1;
        // for(int i=l;i>=0;i--){
        //     System.out.println(a.get(i));
        // }

        //recursive approach

        if(head == null){
            return;
        }

        reversePrint(head.next); //call with recursion with node as head

        System.out.println(head.data);

    }


}