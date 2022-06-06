public class Driver {
    public static void main(String[] args) {
        MinHeap heap1 = new MinHeap();
        MaxHeap heap2 = new MaxHeap();

        heap2.add(10);
        heap2.add(15);
        heap2.add(20);
        heap2.add(19);
        heap2.add(41);
        heap2.add(17);
        heap2.print();
        System.out.println(heap2.peek());
        heap2.add(36);
        heap2.print();
        System.out.println(heap2.removeMax());
        heap2.print();
    }
}
