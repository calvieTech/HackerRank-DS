public class Driver {
    public static void main(String[] args) {
//        myQueue line = new myQueue();
//        line.add(7);
//        line.add(1);
//        line.add(19);
//        line.add(8);
//        line.add(4);
//        System.out.println(line.peek());
//        System.out.println(line.isEmpty());
//        System.out.println(line.remove());
//        System.out.println(line.peek());

        myStack stack = new myStack();
        System.out.println(stack.isEmpty());
        stack.push(21);
        stack.push(3);
        stack.push(1);
        stack.push(8);
        stack.push(6);
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.pop());


    }
}
