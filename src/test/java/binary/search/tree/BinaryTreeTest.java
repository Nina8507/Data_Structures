package binary.search.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    private BinaryTree<Integer> binaryTree;
    private BinaryTreeNode<Integer> root;
    private BinaryTreeNode<Integer> leftChild;
    private BinaryTreeNode<Integer> rightChild;

    @BeforeEach
    public void setUp() {
        root = new BinaryTreeNode<>(7);
        leftChild = new BinaryTreeNode<>(3);
        rightChild = new BinaryTreeNode<>(6);
        binaryTree = new BinaryTree<>(root);
    }

    @Test
    public void getRoot() {
        root.setElement(12);
        binaryTree.setRoot(root);
        assertEquals(binaryTree.getRoot().getElement(), root.getElement());
    }

    @Test
    public void setRoot() {
        root.setElement(14);
        binaryTree.setRoot(root);
        assertNotNull(binaryTree.getRoot());
    }

    @Test
    public void isEmpty() {
        root.setElement(0);
        binaryTree.setRoot(root);
        assertNull(binaryTree.getRoot().getElement());
    }

    @Test
    public void containsElement() {
        root.setElement(14);
        BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(14);
        leftChild.setElement(5);
        root.addLeftChild(leftChild);
        binaryTree.setRoot(root);

        assertTrue(binaryTree.contains(root.getElement()));
    }

    @Test
    public void inOrderTraversal() {
        root.setElement(9);
        leftChild.setElement(7);
        rightChild.setElement(12);
        root.addRightChild(rightChild);
        root.addLeftChild(leftChild);
        binaryTree.setRoot(root);

        ArrayList<BinaryTreeNode<Integer>> getAllNodes = binaryTree.inOrder();

        assertEquals(leftChild, getAllNodes.get(0));
        assertEquals(root, getAllNodes.get(1));
        assertEquals(rightChild, getAllNodes.get(2));
    }

    @Test
    public void preorderTraversal() {
        root.setElement(9);
        leftChild.setElement(6);
        rightChild.setElement(12);
        root.addLeftChild(leftChild);
        root.addRightChild(rightChild);
        binaryTree.setRoot(root);

        ArrayList<BinaryTreeNode<Integer>> getAllNodes = binaryTree.preOrder();

        assertEquals(root, getAllNodes.get(0));
        assertEquals(leftChild, getAllNodes.get(1));
        assertEquals(rightChild, getAllNodes.get(2));
    }
    @Test
    public void postOrderTraversal(){
        root.setElement(9);
        leftChild.setElement(6);
        rightChild.setElement(12);
        root.addLeftChild(leftChild);
        root.addRightChild(rightChild);
        binaryTree.setRoot(root);

        ArrayList<BinaryTreeNode<Integer>> getAllNodes = binaryTree.postOrder();

        assertEquals(leftChild, getAllNodes.get(0));
        assertEquals(rightChild, getAllNodes.get(1));
        assertEquals(root, getAllNodes.get(2));
    }

    @Test
    public void levelOrderTraversal(){
        root.setElement(9);
        leftChild.setElement(6);
        rightChild.setElement(12);
        root.addLeftChild(leftChild);
        root.addRightChild(rightChild);
        binaryTree.setRoot(root);

        ArrayList<BinaryTreeNode<Integer>> getAllNodes = binaryTree.levelOrder();

        assertEquals(root, getAllNodes.get(0));
        assertEquals(leftChild, getAllNodes.get(1));
        assertEquals(rightChild, getAllNodes.get(2));
    }

    @Test
    public void height(){
        root.setElement(9);
        leftChild.setElement(6);
        rightChild.setElement(12);
        root.addLeftChild(leftChild);
        root.addRightChild(rightChild);
        binaryTree.setRoot(root);

        assertEquals(binaryTree.height(), 1);
    }
}