package primitives.driver;

import primitives.MyArrayList;

public class DriverForPrimitives {
    public static void main(String[] args) {
        MyArrayList arr1 = new MyArrayList();
        arr1.add(2);
        arr1.add(5);
        arr1.add(3);
        arr1.add(7);
        arr1.add(4);
        arr1.add(1);
        arr1.print();
        arr1.remove(4);
        arr1.print();
    }
}
