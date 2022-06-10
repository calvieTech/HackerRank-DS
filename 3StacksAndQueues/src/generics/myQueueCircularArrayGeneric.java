package generics;

import generics.exceptions.EmptyQueueException;
import generics.exceptions.FullQueueException;
import generics.interfaces.myQueueCircularArrayGenericInterface;

public class myQueueCircularArrayGeneric<E> implements myQueueCircularArrayGenericInterface<E> {
    int size;
    private static final int DEFAULT_CAPACITY = 10;
    E[] array;
    int front;
    int rear;

    public myQueueCircularArrayGeneric() {
        size = 0;
        array = (E[]) new Object[DEFAULT_CAPACITY];
        front = rear = 0;
    }

    public myQueueCircularArrayGeneric(int sz) {
        size = 0;
        array = (E[]) new Object[sz];
        front = rear = 0;
    }

    public void print() {
        int i = front;
        while(i < rear ) {
            System.out.print(array[i] + " ");
            ++i;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    @Override
    public int size() {
        return (array.length - front - rear) % array.length;
    }

    @Override
    public boolean isEmpty() {
        return (front == rear);
    }

    @Override
    public E front() throws EmptyQueueException {
        return array[front];
    }

    @Override
    public E rear() throws EmptyQueueException {
        return array[rear];
    }

    @Override
    public void enqueue(E element) throws FullQueueException {
        if(size == array.length - 1) {
            throw new FullQueueException();
        } else {
            array[rear] = element;
            rear = (rear + 1) % array.length;
            ++size;
        }
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if(isEmpty()) {
            throw new EmptyQueueException();
        } else {
            E elt = array[front];
            array[front] = null;
            front = (front + 1) % array.length;
            --size;
            return elt;
        }
    }
}
