package primitives.interfaces;

import primitives.exceptions.EmptyQueueException;
import primitives.exceptions.FullQueueException;

public interface myQueueCircularArrayInterface {
    public int size();
    public boolean isEmpty();
    public int front() throws EmptyQueueException;
    public void enqueue(int element) throws FullQueueException;
    public int dequeue() throws EmptyQueueException;
}
