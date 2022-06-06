package Implementation;

public class Driver {
    public static void main(String[] args) {
//        myBinarySearchTree<String, Integer> bst = new myBinarySearchTree<>();
        myBinarySearchTree<String, Integer> bst2 = new myBinarySearchTree<>();
        myBinarySearchTree<String, Integer> bst3 = new myBinarySearchTree<>();

//        bst.putRecursive("H", 01);
//        bst.putRecursive("A", 5);
//        bst.putRecursive("E", 7);
//        bst.putRecursive("R", 14);
//        bst.putRecursive("C", 8);
//        bst.putRecursive("X", 6);
//        bst.putRecursive("S", 11);
//
//        bst.inorder();

        bst2.putIterative("B", 2);
        bst2.putIterative("C", 3);
        bst2.putIterative("D", 4);
        bst2.putIterative("A", 1);

        bst2.inorder();

    }
}
