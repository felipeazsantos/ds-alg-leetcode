package datastructure.linkedlist;

public class MyLinkedList {

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newItem = new Node(value);
        if (this.length == 0) {
            this.head = newItem;
        } else {
            this.tail.next = newItem;
        }
        this.tail = newItem;
        this.length++;
    }

    public void pop() {
        if (this.length == 0) {
            return;
        }

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node temp = this.head;
            while (temp.next != this.tail) {
                temp = temp.next;
            }

            temp.next = null;
            this.tail = temp;
        }

        this.length--;
    }

    public void prepend(int value) {
        Node newItem = new Node(value);
        if (this.length == 0) {
            this.head = newItem;
            this.tail = newItem;
        } else {
            Node temp = this.head;
            this.head = newItem;
            this.head.next = temp;
        }
        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) return null;
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length--;
        if (this.length == 0) this.tail = null;
        return temp;
    }

    public Node getLast() {
        if (this.length == 0) return null;
        return this.get(this.length - 1);
    }

    public Node removeLast() {
        if (this.length == 0) return null;
        if (this.length == 1) return removeFirst();
        Node previousLast = this.get(this.length - 2);
        Node temp = previousLast.next;
        previousLast.next = null;
        this.tail = previousLast;
        this.length--;
        return temp;
    }

    public Node get(int index) {
        if (index >= 0 && index < this.length) {
            Node temp = this.head;
            int i = 0;
            while (i != index) {
                temp = temp.next;
                i++;
            }
            return temp;
        }
        return null;
    }

    public boolean set(int index, int value) {
        Node node = this.get(index);
        if (node != null) {
            node.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == this.length) {
            this.append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node previous = this.get(index - 1);
        Node current = previous.next;
        previous.next = newNode;
        newNode.next =  current;
        this.length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.length) return null;
        if (index == 0) return removeFirst();
        if (index == this.length - 1) return removeLast();

        Node previous = this.get(index - 1);
        Node temp = previous.next;
        previous.next = temp.next;
        temp.next = null;
        this.length--;
        return temp;
    }

}
