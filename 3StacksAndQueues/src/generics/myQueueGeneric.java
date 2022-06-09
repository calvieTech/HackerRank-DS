package generics;

import generics.exceptions.EmptyQueueException;
import primitives.myNode;

public class myQueueGeneric<E> {
    int size = 0;
    myNodeGeneric<E> head;
    myNodeGeneric<E> tail;

    public myQueueGeneric() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public myNodeGeneric<E> getHead() {
        return head;
    }

    public myNodeGeneric<E> getTail() {
        return tail;
    }

    public void setHead(myNodeGeneric<E> h) {
        head = h;
    }

    public void setTail(myNodeGeneric<E> t) {
        tail = t;
    }

    public void checkForEmptyQueue() {
        if(head == null && size == 0) {
            throw new EmptyQueueException();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        myNodeGeneric<E> temp = head;

        while(temp != null) {
            System.out.print(temp.data.toString() + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // insert at the end of the queue
    public void enqueue(E value) {
        myNodeGeneric<E> temp = new myNodeGeneric<>(value, null);

        if(tail != null) {
            tail.next = temp;
        }

        tail = temp;
        if(head == null) {
            head = temp;
        }
        ++size;
    }

    public myNodeGeneric<E> dequeue() {
        checkForEmptyQueue();
        myNodeGeneric<E> firstElt = head;
        head = head.next;
        if(head == null) tail = null;
        --size;
        return firstElt;
    }

    public myNodeGeneric<E> front() {
        checkForEmptyQueue();
        myNodeGeneric<E> firstElt = head;
        return firstElt;
    }

}
