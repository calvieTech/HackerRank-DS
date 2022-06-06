import java.util.Stack;

public class MyQueue<T> {
    private Stack<T> stackNewestOnTop = new Stack<T>();
    private Stack<T> stackOldestOnTop = new Stack<T>();

    public void shiftStacks() {
        if(stackOldestOnTop.isEmpty()) {
            while(!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        }
    }

    // add items
    public void enqueue(T value) {
        stackNewestOnTop.push(value);
    }

    // get "oldest" item
    public T peek() {
        shiftStacks();
        return stackOldestOnTop.peek();
    }

    // get "oldest" item and remove it
    public T dequeue() {
        // move elements from stackNewestOnTop to stackOldestOnTop
        shiftStacks();
        return stackOldestOnTop.peek();
    }
}