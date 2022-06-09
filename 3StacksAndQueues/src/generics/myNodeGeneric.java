package generics;

public class myNodeGeneric<E> {
    protected myNodeGeneric<E> next;
    protected E data;

    public myNodeGeneric() {
        data = null;
        next = null;
    }

    public myNodeGeneric(E data, myNodeGeneric<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public myNodeGeneric<E> getNext() {
        return next;
    }

    public void setNext(myNodeGeneric<E> next) {
        this.next = next;
    }
}
