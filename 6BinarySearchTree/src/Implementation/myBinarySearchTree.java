package Implementation;

import java.util.Comparator;

public class myBinarySearchTree<K extends Comparable<K>, V>{
    private class myNode<K, V> {
        protected K key;
        protected V value;
        protected myNode<K,V> left, right;
        protected boolean isLeaf = false;

        public myNode() {
            key = null;
            value = null;
            left = null;
            right = null;
        }

        public myNode(K key, V val) {
            this.key = key;
            this.value = val;
            left = null;
            right = null;
        }

        public myNode(K key, V val, boolean isLeaf) {
            this.key = key;
            this.value = val;
            left = null;
            right = null;
            this.isLeaf = isLeaf;
        }

        protected boolean isLeaf() {
            return ((this.left == null) && (this.right == null));
        }
    }

    public myBinarySearchTree() {
        root = null;
    }



    private myNode<K,V> root;

    public void inorder() {
        myNode<K,V> itr = root;
        inorderHelper(itr);
    }

    // LEFT -> ROOT -> RIGHT
    private void inorderHelper(myNode<K,V> root) {
        if(root == null) return;

        inorderHelper(root.left);
        System.out.println("Found key: " + root.key + " and value: " + root.value);
        inorderHelper(root.right);
    }

    private boolean isLeaf(myNode<K,V> node) {
        return (node.left == null && node.right == null);
    }

    protected boolean isPresent(K key) {
        if(root == null) throw new NullPointerException("The BST is empty");
        myNode<K,V> itr = root;

        while(itr != null) {
            int cmp = key.compareTo(itr.key);
            if(cmp == 0) {
                System.out.println("Found key: " + itr.key+ " and value: " + itr.value);
                return true;
            } else if(cmp < 0) {
                itr = itr.left;
            } else if(cmp > 0) {
                itr = itr.right;
            }
        }
        return false;
    }


    public void remove(K key) {


    }

    public void removeLeaf(myNode<K,V> assumedLeaf) {
        if(assumedLeaf.isLeaf()) {
            // remove assumedLeaf
        }
        // do something else

    }

//    public void Iterable<K> iterator() {
//
//    }


    public V getIterative(K key) {
        if(root == null) throw new NullPointerException("The BST is empty");
        myNode<K,V> itr = root;
        V result = getHelperIterative(itr, key);
        return result;
    }

    public V getHelperIterative(myNode<K,V> itr, K key) {
        while(itr != null) {
            int cmp = key.compareTo(itr.key);
            if(cmp == 0) {
                System.out.println("Found key: " + itr.key+ " and value: " + itr.value);
                return itr.value;
            } else if(cmp < 0) {
                itr = itr.left;
            } else if(cmp > 0) {
                itr = itr.right;
            }
        }
        return null;
    }

    public V getRecursive(K key) {
        if(root == null) throw new NullPointerException("The BST is empty");
        myNode<K,V> itr = root;
        return getHelperRecursive(itr, key);
    }

    private V getHelperRecursive(myNode<K,V> itr, K key) {
        if(itr == null) return null;

        int cmp = key.compareTo(itr.key);
        if(cmp == 0) {
            System.out.println("Found key: " + itr.key+ " and value: " + itr.value);
            return itr.value;
        } else if(cmp < 0) {
            getHelperRecursive(itr.left, key);
        } else if(cmp > 0) {
            getHelperRecursive(itr.right, key);
        }
        return null;
    }

    public void putRecursive(K key, V value) {
        root = putHelperRecursive(root, key, value);
    }

    // helper method
    private myNode<K,V> putHelperRecursive(myNode<K,V> root, K key, V value) {
        if(root == null) {
            return new myNode<>(key, value, true);
        }

        int cmp = key.compareTo(root.key);
        if(cmp == 0) {
            root.value = value;
        } else if(cmp < 0) {
            root.left = putHelperRecursive(root.left, key, value);
            root.isLeaf = false;
        } else if(cmp > 0) {
            root.right = putHelperRecursive(root.right, key, value);
            root.isLeaf = false;
        }

        return root;
    }

    public void putIterative(K key, V value) {
        root = putIterativeHelper(root, key, value);
    }

    protected  myNode<K,V> putIterativeHelper(myNode<K,V> root, K key, V value) {
        if(root == null) {
            return new myNode<>(key, value, false);
        }
        myNode<K,V> itr = root;
        myNode<K,V> parent = null;

        while(itr != null) {
            parent = itr;
            int cmp = key.compareTo(itr.key);

            if(cmp == 0) {
                itr.value = value;
                return root;
            } else if(cmp < 0){
                if(itr.left == null) {
                    itr.left = new myNode<>(key, value, true);
                } else {
                    itr.isLeaf = false;
                    itr = itr.left;
                }
            } else {
                if(itr.right == null) {
                    itr.right = new myNode<>(key, value, true);
                } else {
                    itr.isLeaf = false;
                    itr = itr.right;
                }
            }
        }
        return root;



    }


}
