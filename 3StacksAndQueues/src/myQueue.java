public class myQueue {
    private static class Node {
        Node next;
        int data;

        private Node(int d) {
            data = d;
        }
    }

    private Node head;
    private Node tail;

    public myQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int peek() {
        if(head == null) throw new NullPointerException("Cannot peek because myQueue is empty");
        return head.data;
    }

    public void add(int d) {
        Node n = new Node(d);

        if(tail != null) {
            tail.next = n;
        }
        tail = n;

        if(head == null) {
            head = n;
        }
    }

    public int remove() {
        int data = head.data;
        head = head.next;
        if(head == null) tail = null;
        return data;
    }
}
