public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.insert(5);
        root.insert(20);
        root.insert(3);
        root.insert(9);
        root.insert(15);
        root.insert(25);
        root.insert(1);
        root.insert(4);
        root.insert(13);
        root.insert(17);
        root.insert(30);

        if(root.contains(9)) {
            System.out.println("9 is in");
        } else {
            System.out.println("9 is not in");
        }

        root.printInOrder();
        System.out.println();
        root.printPreOrder();
        System.out.println();
        root.printPostOrder();


    }
}
