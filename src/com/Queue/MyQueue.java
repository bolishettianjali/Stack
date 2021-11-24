package com.Queue;

public class MyQueue {
    Node head,tail;


    public void enQueue(int data) {
        Node nNode = new Node(data);
        if (head == null){
            head = tail = nNode;
            head.next = null;
        }
        else{
            tail.next = nNode;
            tail = nNode;
        }
    }

    public int deQueue() {
        if (head == null){
            System.out.println("Queue is empty");
            return 0;
        }
        int data = head.data;
        head = head.next;
        return data;

    }

class Node{
    int data;                                //class level variables
    Node next;


    Node(int data){
        this.data = data;
        next = null;
    }
}
}