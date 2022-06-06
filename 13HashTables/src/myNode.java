public class myNode<K, V> {

    private V value;
    private K key;
    protected myNode next;

    public myNode() {
        value = null;
        key = null;
        next = null;
    }

    public myNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public myNode(K key, V value, myNode<K,V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public myNode<K,V> getNext() {
        return next;
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(myNode<K,V> n) {
        this.next = n;
    }

    public void setKey(K key) {
        this.key = key;
    }
}