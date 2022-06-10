package primitives.driver;

import generics.myStackGeneric;
import primitives.myDequeQueue;
import primitives.myQueue;
import primitives.myQueueCircularArray;
import primitives.myStack;

public class DriverForPrimitives {
    public static void josephusProblem(int everyMthPerson, int numOfPeople) {
        myQueue q = new myQueue();

        // initialize the queue
        for(int i = 0; i < numOfPeople; ++i) {
            q.enqueue(i);
        }

        // eliminating every Mth person
        while(!q.isEmpty()) {
            for(int i = 0; i < everyMthPerson - 1; ++i) {
                q.enqueue(q.dequeue());
                System.out.print(q.dequeue() + " ");
            }
        }
        System.out.println();
    }

    public static void driveQueueCircularArray() {
        myQueueCircularArray qca1 = new myQueueCircularArray();
        qca1.enqueue(5);
        System.out.println(qca1.size());
        qca1.enqueue(9);
        qca1.enqueue(7);
        qca1.enqueue(3);
        qca1.enqueue(10);
        qca1.enqueue(4);
        qca1.enqueue(7);
        qca1.enqueue(2);
        qca1.enqueue(6);
        qca1.enqueue(8);
        qca1.enqueue(10);
        qca1.enqueue(5);
        qca1.enqueue(3);
        qca1.enqueue(2);
        System.out.println(qca1.size());


        qca1.print();
    }

    public static void main(String[] args) {
        driveQueueCircularArray();
//        myQueue queue1 = new myQueue();
//        myStack stack1 = new myStack();
//        myDequeQueue deque1 = new myDequeQueue();
//        driveQueueCircularArray();
//        queue1.enqueue(2);
//        queue1.enqueue(5);
//        queue1.enqueue(3);
//        queue1.enqueue(7);
//        queue1.enqueue(4);
//        queue1.enqueue(1);
//        queue1.print();
//        System.out.println(queue1.dequeue());
//        queue1.print();
//        System.out.println(queue1.poll());
//
//        System.out.println();
//        stack1.push(2);
//        stack1.push(5);
//        stack1.push(3);
//        stack1.push(7);
//        stack1.push(4);
//        stack1.push(1);
//        stack1.print();
//        System.out.println(stack1.pop());
//        stack1.print();
//
//        System.out.println();
//        josephusProblem(3, 10);
//
//        System.out.println();
//        deque1.addLast(2);
//        deque1.addLast(5);
//        deque1.addLast(3);
//        deque1.addLast(7);
//        deque1.addLast(4);
//        deque1.addLast(1);
//        deque1.print();
//        deque1.print();

    }
}
