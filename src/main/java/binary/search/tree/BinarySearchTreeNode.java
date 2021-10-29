package binary.search.tree;

public class BinarySearchTreeNode<E extends Comparable<E>> extends BinaryTreeNode<E>{
    private E element;


    public BinarySearchTreeNode(E element) {
        super(element);
    }
}
