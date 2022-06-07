package primitives;

import java.util.Arrays;

public class MyArrayList {
    public int n = 0;
    private int capacity = 10;
    private int[] nums;

    public MyArrayList() {
        n = 0;
        nums = new int[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        nums = new int[capacity];
    }

    public MyArrayList(int[] numsInput) {
        n = numsInput.length;
        nums = numsInput;
    }

    public void ensureExtraCapacity() {
        if(n == capacity) {
            nums = Arrays.copyOf(nums, n * 2);
            capacity *= 2;
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int get(int index) {
        checkIndex(index);
        return nums[index];
    }

    public int set(int index, int newValue) {
        checkIndex(index);
        int oldElt = nums[index];
        nums[index] = newValue;
        return oldElt;
    }

    public void print() {
        for(int i = 0; i < n; ++i) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public void checkIndex(int index) {
        if(index < 0 || index > n) throw new IndexOutOfBoundsException();
    }

    public void shiftArrayRightByOne(int index) {
        for(int i = n - 1; i >= index; --i) {
            nums[i+1] = nums[i];
        }
    }

    public void shiftArrayLeftByOne(int index) {
        for(int i = index; i < n - 1; ++i) {
            nums[i] = nums[i+1];
        }
    }

    public void add(int elt) {
        ensureExtraCapacity();
        int lastIndex = n;
        nums[lastIndex] = elt;
        n++;
    }

    public void add(int index, int elt) {
        checkIndex(index);
        ensureExtraCapacity();
        shiftArrayRightByOne(index);
        nums[index] = elt;
        ++n;
    }

    public int remove(int index) {
       checkIndex(index);
       int oldVal = nums[index];
       shiftArrayLeftByOne(index);
       --n;
       return oldVal;
    }

}
