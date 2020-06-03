// https://www.hackerrank.com/challenges/tree-postorder-traversal/problem

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void postOrder(Node root) {
        // recursive approach
        // if(root == null){
        //     return;
        // }
        // postOrder(root.left);
        // postOrder(root.right);
        // System.out.print(root.data+ " ");

        //iterative approach

        List<Integer> nodeList = new ArrayList<Integer>();
        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();
        if(root == null){
            System.out.print(" ");
        }

        stack1.push(root);
        Node nodes = null;
        while(stack1.isEmpty() == false){
            nodes = stack1.pop();
            stack2.push(nodes);
            if(nodes.left!=null){
                stack1.push(nodes.left);
            }
            if(nodes.right!=null){
                stack1.push(nodes.right);
            }
        }
        while(stack2.isEmpty() == false){
            System.out.print(stack2.pop().data+ " ");
        }


    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }
}