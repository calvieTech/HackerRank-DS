public class myLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    Node head;

    public myLinkedList() {
        head = null;
    }

    public void append(int d) {
        if(head == null) {
            head = new Node(d);
            return;
        }

        Node current = head;

        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(d);
    }

    public void prepend(int d) {
        if(head == null) {
            head = new Node(d);
            return;
        }
        Node newHead = new Node(d);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int value) {
        if(head == null) throw new NullPointerException("Cannot delete value in an empty LL");

        if(head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null) {
            if(current.next.data == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        if(head == null) {
            throw new NullPointerException("Cannot print empty list");
        }
        Node itr = head;

        while(itr != null) {
            String temp = String.valueOf(itr.data);
            System.out.print(temp + " ");
            itr = itr.next;
        }
        System.out.println();
    }
}
