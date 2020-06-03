// https://www.hackerrank.com/challenges/tree-level-order-traversal/problem

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

	/*

    class Node
    	int data;
    	Node left;
    	Node right;
	*/

    public static void LOT(Node root) {
        System.out.print(root.left.data+ " ");
        System.out.print(root.right.data+ " ");

    }
    public static void levelOrder(Node root) {
        if(root ==null){
            System.out.println("");
        }
        Node nodes = null;
        Queue<Node> queueNode = new LinkedList<>();
        queueNode.add(root);

        while(queueNode.size()!=0){
            nodes = queueNode.peek();
            System.out.print(nodes.data+" ");
            queueNode.remove();
            if(nodes.left!=null){
                queueNode.add(nodes.left);
            }
            if(nodes.right!=null){
                queueNode.add(nodes.right);
            }
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
        levelOrder(root);
    }
}