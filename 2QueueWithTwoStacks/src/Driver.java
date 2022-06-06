public class Driver {
    public static void main(String[] args) {
        MyQueue<String> line = new MyQueue<>();

        line.enqueue("Jim");
        line.enqueue("Bob");
        line.enqueue("Mary");
        line.enqueue("John");
        line.enqueue("Alex");
        line.enqueue("Sam");
        line.enqueue("Matt");

        System.out.println("Who is the first in line? " + line.dequeue());
        System.out.println("Who has been in line for the longest? " + line.peek());

    }
}
