import java.util.HashMap;

public class MyHeap {
    class Node {
        HashMap<Character, Node> children;
        boolean isCompleteWord;

        public Node() {
            children = new HashMap<>();
            isCompleteWord = false;
        }


    }
    private static int NUM_OF_CHARS = 26;
    Node root;
    private int size;

    public MyHeap() {
        size = 0;
        root = null;
    }

    public void setNode(char c, Node n) {
        root.children.put(c, n);
    }

    public void add(String s) {
        add(s, 0);
    }

    public void add(String s, int index) {
        if(index == s.length()) return;
        char current = s.charAt(index);
        int charCode =
    }
}
