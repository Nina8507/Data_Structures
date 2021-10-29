package binary.search.tree;

public class BinaryTreeNode<E> {
    private E element;
    private BinaryTreeNode<E> leftChild;
    private BinaryTreeNode<E> rightChild;

    public BinaryTreeNode(E element) {
        this.element = element;
        leftChild = null;
        rightChild = null;
    }

    public void setElement(E element) {
        if (!element.equals(0))
            this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void addLeftChild(BinaryTreeNode<E> leftChild) {
        if (this.leftChild == null)
            this.leftChild = leftChild;
    }

    public void addRightChild(BinaryTreeNode<E> rightChild) {
        if (this.rightChild == null)
            this.rightChild = rightChild;
    }

    public BinaryTreeNode<E> getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode<E> getRightChild() {
        return rightChild;
    }
}

