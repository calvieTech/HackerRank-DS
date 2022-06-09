package primitives;


public class myDequeQueue {
    myQueue queue;


    public myDequeQueue() {
        queue = new myQueue();
    }

    public void print() {
        myQueue temp = queue;

        while(!temp.isEmpty()) {

        }
        System.out.println();
    }

    public void addLast(int value) {
        myNode newNode = new myNode(value);

        if(queue.getHead() == null) {
            queue.setHead(newNode);
        }
        queue.setTail(newNode);

    }


    public void removeFirst() {

    }
}
