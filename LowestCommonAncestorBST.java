// https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem

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
    public static Node lca(Node root, int v1, int v2) {
        if(root == null){
            return root;
        }
        // Write your code here.
        Node copyRoot = root;
        ArrayList<Node> list = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();


        while(root.data != v1){
            if(v1 < root.data){
                list.add(root);
                root = root.left;
            }else{
                list.add(root);
                root = root.right;
            }
        }
        list.add(root);
        root = copyRoot;
        while(root.data != v2){
            if(v2 < root.data){
                list2.add(root);
                root = root.left;

            }else{
                list2.add(root);
                root = root.right;

            }
        }
        list2.add(root);
        if(list.size() != 0 && list2.size() != 0){
            if(list.size() >= list2.size()){
                list.retainAll(list2);
                root = list.get(list.size() - 1);
            }else{
                list2.retainAll(list);
                root = list2.get(list2.size() - 1);
            }
        }else{
            if(list.size() == 0){
                root = list2.get(list2.size() - 1);
            }else{
                root = list.get(list.size() - 1);
            }
        }

        return root;
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
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }
}