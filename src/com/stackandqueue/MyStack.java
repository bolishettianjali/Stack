package com.stackandqueue;

public class MyStack {
    Node head, top;

    public void push(int data) {
        Node nnode = new Node(data);
        if (head == null) {
            head = top = nnode;
        } else {
            Node temp = top;
            top = nnode;
            temp.next = top;
        }
    }
   

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}