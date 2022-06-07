package generics.driver;

import generics.MyArrayListGeneric;

public class DriverForGenerics {
    public static  void main(String[] args) {
        MyArrayListGeneric<Integer> arr1 = new MyArrayListGeneric<>();
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
