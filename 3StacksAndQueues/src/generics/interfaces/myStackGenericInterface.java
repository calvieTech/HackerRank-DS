package generics.interfaces;

import generics.exceptions.EmptyStackException;

public interface myStackGenericInterface<E> {
    public int size();
    public boolean isEmpty();
    public E top() throws EmptyStackException;
    public void push(E elt);
    public E pop() throws EmptyStackException;
}
