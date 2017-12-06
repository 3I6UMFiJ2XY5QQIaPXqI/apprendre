package com.test.java;

public class LinkedList {
    private ListNode head = null;
    private ListNode tail = null;

    public void addFirst(int element) {
        ListNode newNode = new ListNode(element);
        newNode.next = head;
        head = newNode;
    }

    public void printAllNodes() {
        ListNode tmp = head;
        while(tmp != null) {
            System.out.print(tmp.getData());
            tmp = tmp.next;
        }
        System.out.println("");
    }

    public void printFirst() {
        System.out.println(head.getData());
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        ListNode tmp = head;

        if(tmp.next == null) {
            System.out.println("Deleting last element");
            head = null;
            return;
        }

        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        tmp.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.printAllNodes();

//        ll.removeLast();
//        ll.printAllNodes();
//        ll.removeLast();
//        ll.printAllNodes();
        ll.removeLast();
        ll.printAllNodes();
        ll.removeLast();
        ll.printAllNodes();

        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.printAllNodes();

        ll.printFirst();
    }
}

class ListNode {
    private int data;
    ListNode next;

    ListNode(int element) {
        this.data = element;
    }

    public int getData() {
        return this.data;
    }
}
