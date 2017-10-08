package core._4Collections;

/**
 * Created by roman.rudenko on 13-Nov-15.
 */
class BinarySearchTree<E extends Comparable<E>> {

    private BinarySearchTreeNode<E> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(E val) {
        this.root = new BinarySearchTreeNode<E>(val, null);
    }

    public BinarySearchTreeNode<E> getRoot() {
        return root;
    }

    public void add(E val) {
        if(root == null){
            new BinarySearchTreeNode<E>(val, null);
        } else {
            root.add(val);
        }
    }


    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.getValue() +
                ", leftChild=" + root.getLeftChild().toString() +
                ", rightChild=" + root.getRightChild().toString() +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(7);
        bst.add(6);
        bst.add(8);
        bst.add(1);
        bst.add(2);
        System.out.println(bst);
        System.out.println(bst.getRoot().find(2));
        System.out.println(bst.getRoot().find(8));
//        System.out.println(bst.getRoot().find(9));

    }
}



class BinarySearchTreeNode<E extends Comparable<E>> {

    private E value;
    private BinarySearchTreeNode <E> parent;
    private BinarySearchTreeNode <E> leftChild;
    private BinarySearchTreeNode <E> rightChild;

    public BinarySearchTreeNode(E value, BinarySearchTreeNode <E> parent) {
        this.value = value;
        this.parent = parent;
        this.leftChild = null;
        this.rightChild = null;
    }

    public BinarySearchTreeNode<E> addLeftChild(E data) {
        this.leftChild = new BinarySearchTreeNode(data, this);
        return this.leftChild;
    }

    public BinarySearchTreeNode<E> addRightChild(E data) {
        this.rightChild = new BinarySearchTreeNode(data, this);
        return this.rightChild;
    }

    public void add(E val) {
        int compare = val.compareTo(this.getValue());
        if(compare == 0){
            return;
        } else if (compare < 0) {
            if(leftChild == null) {
                leftChild = new BinarySearchTreeNode(val, this);
            } else {
                leftChild.add(val);
            }
        } else {
            if (rightChild == null) {
                rightChild = new BinarySearchTreeNode(val, this);
            } else {
                rightChild.add(val);
            }
        }
    }

    public E find(E val) {
        int compare = val.compareTo(this.getValue());
        if (compare == 0) {
            return this.getValue();
        } else if (compare < 0) {
            return (E) this.leftChild.find(val);
        } else {
            return (E) this.rightChild.find(val);
        }
    }

    public E getValue() {
        return value;
    }

    public BinarySearchTreeNode getParent() {
        return parent;
    }

    public BinarySearchTreeNode getLeftChild() {
        return leftChild;
    }

    public BinarySearchTreeNode getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {

//        System.out.print("{" + value);
//        if (leftChild != null){
//            System.out.println(", leftChild=" + leftChild.toString());
//        }
//        if (rightChild != null){
//            System.out.println(", rightChild=" + rightChild.toString());
//        }
        return "{" + value + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "}";
    }
}
