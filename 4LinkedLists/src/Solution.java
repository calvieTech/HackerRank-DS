public class Solution {
    public static void main(String[] args) {
        myLinkedList list = new myLinkedList();
        list.append(5);
        list.append(1);
        list.append(3);
        list.append(19);

        list.print();

        list.prepend(21);
        list.print();
        list.deleteWithValue(3);
        list.print();


    }
}
