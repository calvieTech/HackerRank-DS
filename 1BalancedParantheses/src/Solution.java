import java.util.regex.*;
import java.util.Stack;

public class Solution {
    public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static boolean isOpenTerm(char c) {
        for (char[] charArray : TOKENS) {
            // check the first element of the subarray
            if (charArray[0] == c) {
                return true;
            }
        }
        return false;
    }
    public static boolean matches(char openTerm, char closedTerm) {
        for(char[] charArray : TOKENS) {
            if(charArray[0] == openTerm) {
                return charArray[1] == closedTerm;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for(char c : expr.toCharArray()) {
            if(isOpenTerm(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String ex1 = "{}()[{}]";
        String ex2 = "[({})]";
        String ex3 = "[({)}]";
        String ex4 = "({[})";

        System.out.println("Is " + ex1 + " balanced? " + isBalanced(ex1));
        System.out.println("Is " + ex2 + " balanced? " + isBalanced(ex2));
        System.out.println("Is " + ex3 + " balanced? " + isBalanced(ex3));
        System.out.println("Is " + ex4 + " balanced? " + isBalanced(ex4));
    }

}
