package datastructures.Stack;

public class Main {
    public static String reverseString(String string) {
        Stack.Stack_AR<Character> stack = new Stack.Stack_AR<>();
        String reversedString = "";

        for (char c : string.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        return reversedString;
    }
    public static boolean isBalancedParentheses(String str) {
        Stack.Stack_AR<Character> stack = new Stack.Stack_AR<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '(') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static Stack.Stack_AR<Integer> sortStack(Stack.Stack_AR<Integer> stack) {
        Stack.Stack_AR<Integer> additionalStack = new Stack.Stack_AR<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }

            additionalStack.push(temp);
        }

        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
        return additionalStack;
    }

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
