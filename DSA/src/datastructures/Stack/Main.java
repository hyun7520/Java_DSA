package datastructures.Stack;

public class Main {
    public static void main(String[] args){
        Stack myStack = new Stack(6);

        myStack.getTop();
        myStack.getHeight();
        myStack.push(1);
        System.out.println("Values: ");
        myStack.printStack();

        myStack.pop();
        System.out.println("Values: ");
        myStack.printStack();
    }
}
