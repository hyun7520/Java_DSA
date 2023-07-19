package datastructures.DLL;

public class Main {
    public static void main(String[] args) {
        DLL myDLL = new DLL(7);

//        Check append method
        myDLL.append(5);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        System.out.println("DLL Values : ");
        myDLL.printList();

//        Check removeLast method
        /*
        System.out.println("\nCheck removeLast");
        DLL reDLL = new DLL(4);
        reDLL.append(9);
        reDLL.printList();
        reDLL.removeLast();
        System.out.println("Removed List : ");
        reDLL.printList();
        System.out.println(reDLL.removeLast().value);
        System.out.println(reDLL.removeLast());
         */

//        Check prepend method
        /*
        System.out.println("\nCheck prepend");
        DLL preDLL = new DLL(5);
        preDLL.prepend(10);
        System.out.println("DLL Values : ");
        preDLL.printList();
         */

//        Check removeFirst method
        System.out.println("\nCheck removeFirst");
        DLL refDLL = new DLL(4);
        refDLL.append(2);


        System.out.println("DLL Values : ");
        refDLL.printList();
        System.out.println("Removed");
        System.out.println(refDLL.removeFirst().value);
        System.out.println(refDLL.removeFirst().value);
        System.out.println(refDLL.removeFirst());
        System.out.println("DLL Values : ");
        refDLL.printList();
    }
}
