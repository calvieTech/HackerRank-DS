package primitives;

import primitives.exceptions.EmptyQueueException;
import primitives.exceptions.FullQueueException;
import primitives.interfaces.myQueueCircularArrayInterface;

public class myQueueCircularArray implements myQueueCircularArrayInterface {
    private static final int DEFAULT_CAPACITY = 15;
    int size;
    int[] array;
    int front; // index of the front element
    int rear; // index immediately past the rear element

    public myQueueCircularArray() {
        array = new int[DEFAULT_CAPACITY];
        front = rear = size = 0;
    }

    public myQueueCircularArray(int cap) {
        array = new int[cap];
        front = rear = size = 0;
    }

    public void checkForEmptyQueue() {
        if(isEmpty()) {
            throw new EmptyQueueException();
        }
    }

    public void print() {
        int i = 0;
        while(i < size) {
            System.out.print(array[i] + " ");
            ++i;
        }
        System.out.println();
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    // different from size() since it does not take into account circular array
    public int getSize() {
        return size;
    }

    @Override
    public int size() {
        return (array.length - front + rear) % array.length;
    }

    @Override
    public boolean isEmpty() {
        return (front == rear);
    }

    @Override
    public int front() throws primitives.exceptions.EmptyQueueException {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public void enqueue(int data) {
        if(size() == array.length) {
            throw new FullQueueException();
        } else {
            array[rear] = data;
            ++size;
            rear = (rear + 1) % array.length;
        }
    }

    @Override
    public int dequeue() throws EmptyQueueException {
        if(isEmpty()) {
            throw new EmptyQueueException();
        } else {
            int oldElt = array[front];
            front = (front + 1) % array.length;
            --size;
            return oldElt;
        }
    }
}
