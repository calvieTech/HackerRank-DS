import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public static void addToBucket(int num, PriorityQueue<Integer> higher, PriorityQueue<Integer> lower) {
        if(lower.size() == 0 || lower.peek() > num) {
            lower.add(num);
        } else {
            higher.add(num);
        }
    }

    public static void rebalance(PriorityQueue<Integer> higher, PriorityQueue<Integer> lower) {
        PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
        PriorityQueue<Integer> smallerHeap = lower.size() > higher.size() ? higher : lower;

        if(biggerHeap.size() - smallerHeap.size() >= 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }

    public static double getMedian(int num, PriorityQueue<Integer> higher, PriorityQueue<Integer> lower) {
        PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
        PriorityQueue<Integer> smallerHeap = lower.size() > higher.size() ? higher : lower;

        if(biggerHeap.size() == smallerHeap.size()) {
            // even number of elements
            return (((double) biggerHeap.peek() + smallerHeap.peek()) / 2);
        } else {
            // odd number of elements
            return biggerHeap.peek();
        }
    }

    public static double[] getMedians(int[] array) {
        PriorityQueue<Integer> higher = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        PriorityQueue<Integer> lower = new PriorityQueue<>();
        double[] medians = new double[array.length];

        for(int i = 0; i < array.length; ++i) {
            int num = array[i];

            addToBucket(num, higher, lower);
            rebalance(higher, lower);
            medians[i] = getMedian(num, higher, lower);
        }
        return medians;
    }
}
