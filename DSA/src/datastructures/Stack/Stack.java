package datastructures.Stack;

import java.util.ArrayList;

public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;
        Node (int value) {this.value = value;}
    }
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    public void printStack(){
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top: "+top.value);
    }
    public void getHeight(){
        System.out.println("Height: "+height);
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        if(height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

//    Stack using array list
    public static class Stack_AR<T> {
        private ArrayList<T> stackList = new ArrayList<>();

        public ArrayList<T> getStackList() {
            return stackList;
        }

        public void printStack() {
            for (int i = stackList.size() - 1; i >= 0; i--) {
                System.out.println(stackList.get(i));
            }
        }

        public boolean isEmpty() {
            return stackList.size() == 0;
        }

        public T peek() {
            if (isEmpty()) {
                return null;
            } else {
                return stackList.get(stackList.size() - 1);
            }
        }

        public int size() {
            return stackList.size();
        }

        public void push(T value) {
            stackList.add(value);
        }

        public T pop() {
            if(isEmpty()) return null;
            int size = stackList.size();
            T temp = stackList.get(size-1);
            stackList.remove(size-1);
            return temp;
        }
    }
}
