public class myLinkedList<K,V>{

    private myNode head;

    public myLinkedList() {
        head = null;
    }

    public myLinkedList(myNode<K,V> head) {
        this.head = head;
    }

    public void prepend(K key, V nameToInsert) {
        if(head == null) {
            head = new myNode(key, nameToInsert, null);
            return;
        } else {
            myNode insert = new myNode(key, nameToInsert, head);
            head = insert;
        }
    }

    public void append(K id, V nameToInsert) {
        if(head == null) {
            head = new myNode(id, nameToInsert, null);
            return;
        } else {
            myNode itr = head;
            while(itr.next != null) {
                itr = itr.next;
            }
            itr.next = new myNode(id, nameToInsert, null);
        }
    }

    public void print() {
        myNode<K,V> itr = head;
        while(itr != null) {
            System.out.println("{Key: " + itr.getKey().toString() + ", Value: " + itr.getValue().toString() + "}, ");
            itr = itr.next;
        }
        System.out.println();
    }
}
