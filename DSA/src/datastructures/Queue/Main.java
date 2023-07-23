package datastructures.Queue;

public class Main {
    public static void main(String[] args){
        Queue myQueue = new Queue(6);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
