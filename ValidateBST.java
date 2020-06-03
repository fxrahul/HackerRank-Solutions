// https://www.hackerrank.com/challenges/is-binary-search-tree/problem

class Solution{
    /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int data;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { data = x; }
     * }
     */
// huge number of node traversal
//     boolean checkBST(Node root) {
//                 if(root == null){
//             return true;
//         }
//         if( leftSideLess(root.left, root.data) && rightSideGreater(root.right, root.data) && checkBST(root.left) && checkBST(root.right) ){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//         public boolean leftSideLess(Node root, int data){
//          if(root == null){
//             return true;
//         }
//         if( root.data < data  && leftSideLess(root.left, data) && leftSideLess(root.right, data) )         {
//             return true;
//         }
//         else{
//             return false;
//         }
//     }

//     public boolean rightSideGreater(Node root, int data){
//          if(root == null){
//             return true;
//         }
//                 if( root.data > data  && rightSideGreater(root.left, data) &&                                        rightSideGreater(root.right, data) ){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }

//less node traversal
    public boolean checkBSTAlias(Node root, int minVal, int maxVal){
        if(root == null){
            return true;
        }
        if(root.data < maxVal && root.data > minVal &&
                checkBSTAlias(root.left, minVal, root.data) && checkBSTAlias(root.right, root.data, maxVal)){
            return true;
        }else{
            return false;
        }
    }
    boolean checkBST(Node root){
        return checkBSTAlias(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}