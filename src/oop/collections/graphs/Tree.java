package oop.collections.graphs;

public class Tree {
    Node root;

    void addData(int data){
        add(this.root, data);
    }

    void add(Node root, int newData){
        if (root == null) {
            root = new Node();
            root.data = newData;
        }else if (newData > root.data){
            add(root.right, newData);
        } else if (newData < root.data) {
            add(root.left, newData);
        }
    }
}class Node{
    int data;
    Node left, right;
}
