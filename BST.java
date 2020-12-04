class BSTNode<T> {
    public String key;
    public T data;
    public BSTNode<T> left, right;


    public BSTNode(String key, T data) {
        this.key = key;
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return toString("");
    }

    private String toString(String ident) {
        return ident + key + " = " + data.toString() +
                ((left == null) ? "" : "\n" + left.toString(ident + '\t')) +
                ((right == null) ? "" : "\n" + right.toString(ident + '\t'));
    }


  /*  public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
        if (right != null) {
            right.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
        }
        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(key + " = " + data.toString()).append("\n");
        if (left != null) {
            left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
        }
        return sb;
    }

    @Override
    public String toString() {
        return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
    }*/
}

public class BST<T> {

    private BSTNode<T> root, current;
    private int numberOfComparisons;

    public BST() {
        current = root = null;
    }

    public void clear() {
        current = root = null;
    }

    public boolean empty() {
        return root == null;
    }

    public boolean full() {
        return false;
    }

    public T retrieve() {
        return current.data;
    }

    public boolean findKey(String k) {
        numberOfComparisons = 1;
        BSTNode<T> p = root;
        while (p != null) {
            current = p;
            if (k.compareTo(p.key) == 0) {
                return true;
            } else if (k.compareTo(p.key) < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
            numberOfComparisons++;
        }
        return false;
    }

    public boolean insert(String k, T val) {
        if (root == null) {
            current = root = new BSTNode<T>(k, val);
            return true;
        }

        BSTNode<T> p = current;
        if (findKey(k)) {
            current = p;
            return false;
        }

        BSTNode<T> tmp = new BSTNode<T>(k, val);
        if (k.compareTo(current.key) < 0) {
            current.left = tmp;
        } else {
            current.right = tmp;
        }
        current = tmp;
        return true;
    }

    public boolean removeKey(String k) {

        // Search for k
        String k1 = k;
        BSTNode<T> p = root;
        BSTNode<T> q = null; // Parent of p
        while (p != null) {

            if (k1.compareTo(p.key) < 0) {
                q = p;
                p = p.left;
            } else if (k1.compareTo(p.key) > 0) {
                q = p;
                p = p.right;
            } else { // Found the key

                // Check the three cases
                if ((p.left != null) && (p.right != null)) { // Case 3: two
                    // children

                    // Search for the min in the right subtree
                    BSTNode<T> min = p.right;
                    q = p;
                    while (min.left != null) {
                        q = min;
                        min = min.left;
                    }
                    p.key = min.key;
                    p.data = min.data;
                    k1 = min.key;
                    p = min;
                    // Now fall back to either case 1 or 2
                }

                // The subtree rooted at p will change here
                if (p.left != null) { // One child
                    p = p.left;
                } else { // One or no children
                    p = p.right;
                }

                if (q == null) { // No parent for p, root must change
                    root = p;
                } else {
                    if (k1.compareTo(q.key) < 0) {
                        q.left = p;
                    } else {
                        q.right = p;
                    }
                }
                current = root;
                return true;

            }
        }

        return false; // Not found
    }

    public boolean update(String k, T val) {
        if (findKey(k)) {
            current.data = val;
            return true;
        } else {
            return false;
        }
    }

    public BSTNode<T> getRoot() {
        return root;
    }

    public void printPreOrder(BSTNode<T> node) {
        if (node == null)
            return;
        // now deal with the node
        System.out.println(node.key + " :: " + node.data + " ");
        // first recur on left subtree
        printPreOrder(node.left);

        // then recur on right subtree
        printPreOrder(node.right);


    }

    public void printInOrder(BSTNode<T> node) {
        if (node == null)
            return;

        // first recur on left subtree
        printInOrder(node.left);
        // now deal with the node
        System.out.println(node.key + " :: " + node.data + " ");
        // then recur on right subtree
        printInOrder(node.right);


    }

    public void printPostOrder(BSTNode<T> node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostOrder(node.left);

        // then recur on right subtree
        printPostOrder(node.right);

        // now deal with the node
        System.out.println(node.key + " :: " + node.data + " ");
    }

    @Override
    public String toString() {
        if (root == null)
            return "NULL";
        return root.toString();
    }

    public int getNumberOfComparisons(String k) {
        findKey(k);
        return numberOfComparisons;
    }

}


