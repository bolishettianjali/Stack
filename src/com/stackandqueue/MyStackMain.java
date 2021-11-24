package com.stackandqueue;

public class MyStackMain {
    public static void main(String[] args){
        MyStack myStack=new MyStack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        myStack.pop();
    }
}
