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