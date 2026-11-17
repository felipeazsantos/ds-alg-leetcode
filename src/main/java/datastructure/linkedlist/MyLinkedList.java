package datastructure.linkedlist;

import datastructure.Node;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

}
