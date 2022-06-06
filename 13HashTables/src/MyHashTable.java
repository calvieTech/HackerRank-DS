import java.util.Arrays;

public class MyHashTable {
    final int DEFAULT_SIZE = 17;
    myNode[] data;
    int n = 0;
    int capacity = 0;

    public MyHashTable() {
        capacity = DEFAULT_SIZE;
        data = new myNode[capacity];
    }

    public MyHashTable(int cap) {
        capacity = cap;
        data = new myNode[capacity];
    }

    public boolean hasValue(int index) {
        if(data[index].getKey() != null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return n;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int getHashCode(Object key) {
        return key.hashCode();
    }

    public int convertToIndex(int hashCode) {
        int index = (hashCode & 0x7FFFFFFF) % data.length;
        return index;
    }

    public void resize() {
        if(n == capacity) {
            data = Arrays.copyOf(data, capacity *= 2);
            capacity *= 2;
        }
    }

    public void print() {
        myNode itr = data[0];

        while(itr != null) {
            System.out.println(itr.getKey().toString() + " " + itr.getValue().toString());
            itr = itr.next;
        }
        System.out.println();
    }

    public void put(Object key, Object value) {
        int hashCode = this.getHashCode(key);
        int index = convertToIndex(hashCode);
        myNode itr = data[index];

        while(itr != null) {
            if(itr.getKey().equals(key)) {
                itr.setValue(value);
                return;
            }
            itr = itr.next;
        }

        if(itr != null) {
            // elt already has a key in the list
            itr.setValue(value);
        } else {
            if(n >= 0.75 * data.length) {
                resize();
            }
            myNode insert = new myNode(key, value);
            insert.next = data[index];
            data[index] = insert;
        }
        ++n;

    }



}
