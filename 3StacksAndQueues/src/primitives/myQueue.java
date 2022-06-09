package primitives;

public class myQueue {

    private myNode head;
    private myNode tail;
    int size = 0;

    public myQueue() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int peek() {
        if(head == null) throw new NullPointerException("Cannot peek because myQueue is empty");
        return head.data;
    }

    public myNode getHead() {
        return head;
    }

    public myNode getTail() {
        return tail;
    }

    public void setHead(myNode h) {
        head = h;
    }

    public void setTail(myNode t) {
        tail = t;
    }

    public void print() {
        myNode temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void enqueue(int d) {
        myNode n = new myNode(d);

        if(tail != null) {
            tail.next = n;
        }
        tail = n;

        if(head == null) {
            head = n;
        }
        ++size;
    }

    public int poll() {
        int data = head.data;
        return data;
    }

    public int dequeue() {
        int data = head.data;
        head = head.next;
        if(head == null) tail = null;
        --size;
        return data;
    }
}
