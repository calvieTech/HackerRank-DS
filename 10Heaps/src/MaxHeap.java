import java.util.Arrays;

public class MaxHeap {
    private int size = 0;
    private int capacity = 10;
    private int[] items;

    public MaxHeap() {
        size = 0;
        capacity = 10;
        items = new int[capacity];
    }

    public MaxHeap(int cap) {
        size = 0;
        capacity = cap;
        items = new int[capacity];
    }

    private boolean hasParent(int childIndex) {
        return getParentIndex(childIndex) >= 0;
    }

    private boolean hasLeftChild(int parentIndex) {
        return getLeftChildIndex(parentIndex) < size;
    }

    private boolean hasRightChild(int parentIndex) {
        return getRightChildIndex(parentIndex) < size;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private int getLeftChildIndex(int parentIndex) {
        return (parentIndex * 2) + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return (parentIndex * 2) + 2;
    }

    private int parent(int childIndex) {
        return items[getParentIndex(childIndex)];
    }

    private int leftChild(int parentIndex) {
        return items[getLeftChildIndex(parentIndex)];
    }

    private int rightChild(int parentIndex) {
        return items[getRightChildIndex(parentIndex)];
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if(size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek() {
        if(size == 0) throw new IllegalStateException();
        return items[0];
    }

    public void print() {
        int i = 0;
        while(i < size) {
            System.out.print(items[i] + " ");
            ++i;
        }
        System.out.println();
    }

    // O(log n) time
    public void heapifyUp() {
        int index = size - 1;

        while(hasParent(index) && items[index] > parent(index)) {
            int parentIndex = getParentIndex(index);
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    public void add(int element) {
        ensureExtraCapacity();
        int index = size;
        items[index] = element;
        size++;
        heapifyUp();
    }

    public void heapifyDown() {
        int index = 0;

        while(hasLeftChild(index)) {
            int greaterChildIndex = getLeftChildIndex(index);
            if(items[greaterChildIndex] < items[getRightChildIndex(index)]) {
                greaterChildIndex = getRightChildIndex(index);
            }

            if(items[greaterChildIndex] < items[index]) {
                break;
            } else {
                swap(index, greaterChildIndex);
            }
        }
    }


    public int removeMax() {
        if(size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }
}
