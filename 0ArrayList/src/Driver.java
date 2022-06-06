public class Driver {
    public static void main(String[] args) {
        MyArrayListGeneric<Integer> list1= new MyArrayListGeneric<>();
        list1.add(2);
        list1.add(5);
        list1.add(3);
        list1.print();
        list1.add(7);
        list1.add(4);
        list1.add(9);
        list1.print();

        list1.add(2, 6);
        list1.print();
        System.out.println(list1.size());
        list1.remove(3);
        list1.print();
        System.out.println(list1.size());
        System.out.println(list1.set(5, 14));
        list1.print();
    }
}
