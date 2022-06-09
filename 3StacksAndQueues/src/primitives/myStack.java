package primitives;

public class myStack {

    private myNode top;

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
        myNode n = new myNode(d);
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
        myNode temp = top;
        while(temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
