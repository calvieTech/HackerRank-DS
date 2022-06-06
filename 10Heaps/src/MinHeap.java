import java.util.Arrays;

public class MinHeap {
    private int capacity = 10;
    private int size = 0;
    private int[] items;

    public MinHeap() {
        capacity = 10;
        size = 0;
        items = new int[capacity];
    }

    public MinHeap(int cap) {
        capacity = cap;
        size = 0;
        items = new int[capacity];
    }


    private int getParentIndex(int childIndex) {
        return (childIndex - 2) / 2;
    }
    private int getLeftChildIndex(int parentIndex) {
        return (parentIndex * 2) + 1;
    }
    private int getRightChildIndex(int parentIndex) {
        return (parentIndex * 2) + 2;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private boolean hasLeftChild(int parentIndex) {
        return getLeftChildIndex(parentIndex) < size;
    }

    private boolean hasRightChild(int parentIndex) {
        return getRightChildIndex(parentIndex) < size;
    }

    public int parent(int childIndex) {
        return items[getParentIndex(childIndex)];
    }

    public int leftChild(int parentIndex) {
        return items[getLeftChildIndex(parentIndex)];
    }

    public int rightChild(int parentIndex) {
        return items[getRightChildIndex(parentIndex)];
    }

    // swap the inputs
    public void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    // if capacity is reached, make more room for items
    public void ensureExtraCapacity() {
        if(size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    // access but don't remove min element
    public int peek() {
        if(size == 0) throw new IllegalStateException();
        return items[0];
    }

    public void print() {
        ensureExtraCapacity();
        for(int i = 0; i < size; ++i) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public void heapifyDown() {
        int index = 0, smallerChildIndex = 0;

        while(hasLeftChild(index)) {
            smallerChildIndex = getLeftChildIndex(index);

            if(hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if(items[index] < items[smallerChildIndex]) break;
            else swap(index, smallerChildIndex);
            index = smallerChildIndex;
        }
    }

    public void heapifyUp() {
        int index = size - 1;

        while(hasParent(index) && parent(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    // extract & remove the min element (i.e. the root)
    public int removeMin() {
        if(size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    // insert a new elt into the MinHeap
    public void add(int elt) {
        ensureExtraCapacity();
        items[size] = elt;
        size++;
        heapifyUp();
    }
}
