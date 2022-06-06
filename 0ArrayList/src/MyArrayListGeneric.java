import java.util.Arrays;

// Space: O(n)
// Time: for size, isEmpty, get & set -> O(1) time
//       for add & remove methods -> O(n) time WORST-CASE
public class MyArrayListGeneric<E> {
    public int size = 0;
    private int capacity = 10;
    private E[] array;

    public MyArrayListGeneric() {
        array = (E[]) new Object[capacity];
    }

//    public MyArrayListGeneric(int sz) {
//        size = sz;
//        capacity = 2 * size;
//        array = (E[]) new Object[size];
//    }

    public void ensureExtraCapacity() {
        if(size >= capacity) {
            array = Arrays.copyOf(array, size * 2);
            capacity *= 2;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E get(int index) {
        checkIndex(index);
        return array[index];
    }

    public E set(int index, E object) {
        checkIndex(index);
        E temp = array[index];
        array[index] = object;
        return temp;
    }

    public void print() {
        for(int i = 0; i < size; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void shiftRightOnce(int index) {
        for(int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
    }

    public void shiftLeftOnce(int index) {
        for(int i = index; i < size - 1; ++i) {
            array[i] = array[i+1];
        }
    }

    public void checkIndex(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }
    public void add(E object) {
        ensureExtraCapacity();
        array[size] = object;
        ++size;
    }
    public void add(int index, E object) {
        checkIndex(index);
        ensureExtraCapacity();
        shiftRightOnce(index);
        array[index] = object;
        ++size;
    }

    public E remove(int index) {
        checkIndex(index);
        E temp = array[index];
        shiftLeftOnce(index);
        --size;
        return temp;

    }
}
