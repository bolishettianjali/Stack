package com.stackandqueue;

public class MyStack {
    Node head;

    public void push(int data) {
        Node nnode = new Node(data);
        if (head == null) {
            head=nnode;
        } else {
            Node temp = head;
            head = nnode;
            head.data=nnode.data;
            head.next=temp;
        }
    }
   public int peek(){
        int value= head.data;
        return value;
   }
   public void pop(){
        if(head==null){
            System.out.println("Stack is empty");
        }
        else{
            Node temp=head;
            head=head.next;
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