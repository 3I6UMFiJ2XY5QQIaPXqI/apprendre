package com.test.java;

public class Stack {
    private int size;
    private int[] stackArray;
    private int top = -1;

    public Stack(int arraySize) {
        stackArray = new int[arraySize];
    }

    public void push(int element) {
        top++;
        stackArray[top] = element;
    }

    public int pop() {
        int element = stackArray[top];
        stackArray[top] = 0;
        top--;
        return element;
    }

    public int peek() {
        return stackArray[top];
    }

    public Boolean isEmpty() {
        if(top < 0) {
            return true;
        } else {
            return false;
        }

    }

    public void test() {
        System.out.println(stackArray[0]);
    }

    public static void main(String[] args) {
        Stack s  = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());

        System.out.println(s.isEmpty());
    }
}
