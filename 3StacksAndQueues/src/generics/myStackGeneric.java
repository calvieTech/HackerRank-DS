package generics;

import generics.exceptions.EmptyStackException;
import generics.interfaces.myStackGenericInterface;

public class myStackGeneric<E> implements myStackGenericInterface<E> {
    myNodeGeneric<E> top;
    int size;

    public myStackGeneric() {
        size = 0;
        top = null;
    }

    public void print() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        myNodeGeneric<E> itr = top;
        while(itr != null) {
            System.out.print(itr.getData() + " ");
            itr = itr.getNext();
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E top() throws EmptyStackException {
        if(top == null) {
            throw new EmptyStackException();
        } else {
            E temp = top.getData();
            return temp;
        }
    }

    @Override
    public void push(E elt) {
        myNodeGeneric<E> newElt = new myNodeGeneric<>(elt, top);
        top = newElt;
        ++size;
    }

    @Override
    public E pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            E temp = top.data;
            top = top.next;
            --size;
            return temp;
        }
    }

    @Override
    public int size() {
        return size;
    }



}
