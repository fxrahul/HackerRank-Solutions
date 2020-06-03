// https://www.hackerrank.com/challenges/tree-inorder-traversal/problem

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

    public static void inOrder(Node root) {
        Stack<Node> nodeStack = new Stack<>();

        if(root == null){
            System.out.print(" ");
        }
        Node nodes = root;
        while(nodes != null || nodeStack.isEmpty() == false){
            while(nodes!=null){ // for left traversal
                nodeStack.push(nodes);
                nodes = nodes.left;
            }

            nodes = nodeStack.pop();
            System.out.print(nodes.data+ " ");// store root
            nodes = nodes.right; // for right traversal
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
        inOrder(root);
    }
}