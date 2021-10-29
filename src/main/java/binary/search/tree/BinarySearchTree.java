package binary.search.tree;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>{
    private BinarySearchTreeNode<E> root;

    public BinarySearchTree(BinaryTreeNode<E> root) {
        super(root);
    }

    public void insert(E element){
        insertNode(root, element);
    }

    private BinaryTreeNode<E> insertNode(BinaryTreeNode<E> root, E element) {
        if(root == null)
            return new BinaryTreeNode<E>(element);

        if(root.getElement().compareTo(element) == 1){
            root.addLeftChild(insertNode(root.getLeftChild(), element));
        } else if(root.getElement().compareTo(element) == -1){
            root.addRightChild(insertNode(root.getRightChild(), element));
        }
        return root;
    }

    public void removeElement(E element){
        removeNode(root, element);
    }

    private BinaryTreeNode<E> removeNode(BinaryTreeNode<E> root, E element) {
        // 3 cases
        // when e is a leaf
        // when e has only one child
        // when e has 2 children
        return null;
    }
}
