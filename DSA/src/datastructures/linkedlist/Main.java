package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.prepend(5);

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.set(1, 4);

        myLinkedList.insert(2, 9);

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

//        System.out.println("Node :" + myLinkedList.get(2).value);

//        // doesn't return value if list is empty;
//        System.out.println("remove last: "+myLinkedList.removeLast().value);
//        System.out.println("remove first: "+myLinkedList.removeFirst().value);
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
    }
}
