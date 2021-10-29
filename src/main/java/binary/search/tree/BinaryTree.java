package binary.search.tree;

import java.util.ArrayList;

public class BinaryTree<E> {

    private BinaryTreeNode<E> root;
    private int size;

    public BinaryTree(BinaryTreeNode<E> root) {
        this.root = root;
    }

    public BinaryTreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<E> node) {
        root = node;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size(root);
    }

    private int size(BinaryTreeNode<E> root) {
        if (root == null)
            return 0;
        return size(root.getLeftChild()) + size(root.getRightChild()) + 1;
    }

    public boolean contains(E element) {
        return findElement(element, this.root) != null;
    }

    private BinaryTreeNode<E> findElement(E element, BinaryTreeNode<E> root) {
        if (root == null)
            return null;
        //some code
        return null;
    }

    public ArrayList<BinaryTreeNode<E>> inOrder() {
        return traverseInOrder(root);
    }

    private ArrayList<BinaryTreeNode<E>> traverseInOrder(BinaryTreeNode<E> node) {
        if (node == null)
            return null;

        ArrayList<BinaryTreeNode<E>> getAllNodes = new ArrayList<>();

        traverseInOrder(node.getLeftChild());
        getAllNodes.add(node.getLeftChild());

        getAllNodes.add(node);

        traverseInOrder(node.getRightChild());
        getAllNodes.add(node.getRightChild());

        return getAllNodes;
    }

    public ArrayList<BinaryTreeNode<E>> preOrder() {
        return preOrderTraversal(root);
    }

    private ArrayList<BinaryTreeNode<E>> preOrderTraversal(BinaryTreeNode<E> root) {
        if (root == null)
            return null;

        ArrayList<BinaryTreeNode<E>> getAllNodes = new ArrayList<>();

        getAllNodes.add(root);

        preOrderTraversal(root.getLeftChild());
        getAllNodes.add(root.getLeftChild());

        preOrderTraversal(root.getRightChild());
        getAllNodes.add(root.getRightChild());

        return getAllNodes;
    }

    public ArrayList<BinaryTreeNode<E>> postOrder(){
        return postOrderTraversal(root);
    }

    private ArrayList<BinaryTreeNode<E>> postOrderTraversal(BinaryTreeNode<E> root) {
        if(root == null)
            return null;

        ArrayList<BinaryTreeNode<E>> getAllNodes = new ArrayList<>();

        postOrderTraversal(root.getLeftChild());
        getAllNodes.add(root.getLeftChild());

        postOrderTraversal(root.getRightChild());
        getAllNodes.add(root.getRightChild());

        getAllNodes.add(root);

        return getAllNodes;
    }
    public ArrayList<BinaryTreeNode<E>> levelOrder(){
        return levelOrderTraversal(root);
    }

    private ArrayList<BinaryTreeNode<E>> levelOrderTraversal(BinaryTreeNode<E> root) {
        if(root == null)
            return null;

        ArrayList<BinaryTreeNode<E>> getAllNodes = new ArrayList<>();

        getAllNodes.add(root);

        levelOrderTraversal(root.getLeftChild());
        getAllNodes.add(root.getLeftChild());

        levelOrderTraversal(root.getRightChild());
        getAllNodes.add(root.getRightChild());

        return getAllNodes;
    }
    public int height(){
        return treeHeight(root);
    }

    private int treeHeight(BinaryTreeNode<E> root) {
        if(root == null)
            return -1;

        if(root.getLeftChild() == null && root.getRightChild() == null)
            return 0;

        return Math.max(treeHeight(root.getLeftChild()), treeHeight(root.getRightChild())) +1;
    }
}
