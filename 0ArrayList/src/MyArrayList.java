import java.util.Arrays;

public class MyArrayList {
    public int n = 0;
    private int capacity = 10;
    private int[] nums;

    public MyArrayList() {
        n = 0;
        nums = new int[capacity];
    }

    public MyArrayList(int[] numsInput) {
        n = numsInput.length;
        nums = numsInput;
    }

    public void ensureExtraCapacity() {
        if(n == capacity) {
            nums = Arrays.copyOf(nums, capacity * 2);
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
        if(index < 0 || index > n) throw new IndexOutOfBoundsException();
        return nums[index];
    }

    public int set(int index, int newValue) {
        if(index < 0 || index > n) throw new IndexOutOfBoundsException();
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

    public void shiftArrayRightByOne(int index) {
        if(index > n) {
            index %= n;
        }
        int[] tempArr = new int[size()];
        for(int i = 0; i < index; ++i) {
            tempArr[i] = nums[i];
        }

        int idx;
        for(idx = index; idx < size() - 1; ++idx) {
            tempArr[idx + 1] = nums[idx];
        }
        System.arraycopy(tempArr, 0, nums, 0, n);
    }

    public void shiftArrayLeftByOne(int index) {
        int[] temp = new int[n];
        for(int i = 0; i < n; ++i) {
            temp[(i + n - 1) % n] = nums[i];
        }
        nums = Arrays.copyOf(temp, n);
    }

//    public void shiftArrayLeftByK(int index, int k) {
//        int[] temp = new int[n];
//        for(int i = 0; i < n; ++i) {
//
//        }
//    }

    // adds it to the end of the ArrayList
    public void add(int elt) {
        ensureExtraCapacity();
        int lastIndex = size();
        nums[lastIndex] = elt;
        n++;
    }

    public void add(int index, int elt) {
        if(index < 0 || index > n) throw new IndexOutOfBoundsException();
        ensureExtraCapacity();
        n++;
        shiftArrayRightByOne(index);
        nums[index] = elt;
    }

    public int remove(int index) {
       if(index < 0 || index > n) throw new IndexOutOfBoundsException();
       if(nums[index] == -1) {
           System.out.println("Cannot remove a negative value!");
           return -1;
       }
       int temp = nums[index];
       nums[index] = -1;
       shiftArrayLeftByOne(index);
       --n;
       return temp;


    }

}
