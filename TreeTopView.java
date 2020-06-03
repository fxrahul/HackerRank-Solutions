// https://www.hackerrank.com/challenges/tree-top-view/problem

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

    public static void topView(Node root) {
        if(root == null){
            System.out.print(" ");
        }
        int hd = 0;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> listBFS = new ArrayList<Integer>();
        Queue<Node> nodeQueue = new LinkedList<>();
        Map<Integer, List<Integer>> nodeMap = new HashMap<>();
        nodeQueue.add(root);
        list.add(root.data);
        nodeMap.put(hd,list);
        //  System.out.print(root.data+" ");
        Map<Node, Integer> distances = new HashMap<>();
        distances.put(root,hd);
        Node nodes = null;
        while(nodeQueue.isEmpty() == false){
            nodes = nodeQueue.remove();
            listBFS.add(nodes.data);
            if(nodes.left != null){
                nodeQueue.add(nodes.left);
                distances.put(nodes.left,(distances.get(nodes) - 1));
                hd = distances.get(nodes.left);
                if(!nodeMap.containsKey(hd)){
                    list = new ArrayList<Integer>();
                    list.add(nodes.left.data);
                    nodeMap.put(hd,list);
                }else{
                    list = nodeMap.get(hd);
                    list.add(nodes.left.data);
                    nodeMap.put(hd,list);
                }
            }
            if(nodes.right != null){
                nodeQueue.add(nodes.right);
                distances.put(nodes.right,(distances.get(nodes) + 1));
                hd = distances.get(nodes.right);
                if(!nodeMap.containsKey(hd)){
                    list = new ArrayList<Integer>();
                    list.add(nodes.right.data);
                    nodeMap.put(hd,list);
                }else{
                    list = nodeMap.get(hd);
                    list.add(nodes.right.data);
                    nodeMap.put(hd,list);
                }
            }
        }
        ArrayList<Integer> sortedKeys = new ArrayList<Integer>(nodeMap.keySet());
        Collections.sort(sortedKeys);
        // int nodeValue = 0;

        for(Integer i : sortedKeys){
            ArrayList<Integer> sortedList = new ArrayList<Integer>(nodeMap.get(i));
            System.out.print(sortedList.get(0) + " ");
        }
        // System.out.print("BFS List: "+listBFS);
        // System.out.print("Node List: "+nodeMap);
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
        topView(root);
    }
}