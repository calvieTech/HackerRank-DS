public class myStack {
    private static class Node {
        Node next;
        int data;

        private Node(int d) {
            data = d;
        }
        private void printData() {
            System.out.print(this.data + " ");
        }

    }

    private Node top;

    public myStack() {
        top = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int peek() {
        if(top == null) throw new NullPointerException("Cannot peek inside an empty stack");
        return top.data;
    }

    public void push(int d) {
        Node n = new Node(d);
        n.next = top;
        top = n;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    public void print() {
        if(top == null) throw new NullPointerException("Cannot print an empty stack");
        Node temp = top;
        while(temp != null) {
            temp.printData();
            temp = temp.next;
        }
        System.out.println();
    }
}
