import datastructure.linkedlist.MyLinkedList;

void main() {
    IO.println("DS and Algorithms starts run...");
    MyLinkedList linkedList = new MyLinkedList(4);

    linkedList.append(10);
    linkedList.append(5);
    linkedList.append(16);
    linkedList.append(48);

//    linkedList.getHead();
//    linkedList.getTail();
//    linkedList.getLength();
//    linkedList.printList();

//    System.out.println("-------------------------------");

//    linkedList.pop();

    linkedList.prepend(31);

    linkedList.printList();
}

