package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Class within a Class: Inner/ Nested Class
    class Node {
        int value;
        Node next;
        // Node type create variable that points to a Node
        Node(int value) {
            this.value = value;
        }
    }
    public LinkedList(int value) {
        // Create New Node
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public void getHead() {
        if(head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }
    public void getTail() {
        if(head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: "+tail.value);
        }
    }
    public void getLength() {
        System.out.println("Length: "+length);
    }
    public void append(int value) {
        // Create New Node & Add Node to End
    }
    public void prepend(int value) {
        // Create New Node & Add Node to Beginning
    }
    public void insert(int index, int value) {
        // Create New Node & Insert Node
    }
}
