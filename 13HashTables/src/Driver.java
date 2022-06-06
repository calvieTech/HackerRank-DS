public class Driver {
    public static void main(String[] args) {
        MyHashTable test = new MyHashTable(10);
        test.put(1, "Calvin");
        test.put(3, "Julie");
        test.put(2, "Linny");
        test.put(10, "Baldwin");
        test.put(16, "Mike");
        test.print();


    }
}
