package generics.interfaces;

import generics.exceptions.EmptyQueueException;
import generics.exceptions.FullQueueException;

public interface myQueueCircularArrayGenericInterface<E> {
    public int size();
    public boolean isEmpty();
    public E front() throws EmptyQueueException;
    public E rear() throws EmptyQueueException;
    public void enqueue(E element) throws FullQueueException;
    public E dequeue() throws EmptyQueueException;
}
