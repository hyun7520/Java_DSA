package datastructures.DLL;
public class DLL {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
    }
    public DLL (int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead() {
        System.out.println("Head : " + head.value);
    }
    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }
    public void getLength() {
        System.out.println("Length : " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(head == null) return null;
        Node temp = tail;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(head == null) return null;
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node prev = get(index-1);
        Node after = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = after;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index > length) return null;
        if(index == 0) {
            return removeFirst();
        }
        if(index == length-1) {
            return removeLast();
        }
        Node temp = get(index);
        Node prev = temp.prev;
        Node next = temp.next;
        prev.next = next;
        next.prev = prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public Node removeAnotherMethod(int index) {
        if(index < 0 || index > length) return null;
        if(index == 0) {
            return removeFirst();
        }
        if(index == length-1) {
            return removeLast();
        }
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
        length--;
        return temp;
    }

//    Leet code exercise
    public void swapFirstLast(){
        if(length < 2) return;
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;
    }

    public void reverse(){
        Node current = head;
        Node temp = null;

        while(current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    public boolean isPalindrome(){

        Node forward = head;
        Node backward = tail;
        for(int i = 0; i < length/2; i++) {
            if(forward.value != backward.value) {
                return false;
            }
            forward = forward.next;
            backward = backward.prev;
        }
        return true;
    }

    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;

            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = prev;
            firstNode.prev = secondNode;
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            head = firstNode.next;
            prev = firstNode;
        }

        head = dummy.next;
        if (head != null) head.prev = null;
    }

}
