package binary.search.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class BinaryTreeNodeTest {
    private BinaryTreeNode<Integer> node;

    @BeforeEach
    public void setUp() {
        node = new BinaryTreeNode<Integer>(21);
    }

    @Test
    public void setNullElement() {
        node.setElement(0);
        assertNotNull(node.getElement());
    }

    @Test
    public void setNotNullElement() {
        node.setElement(33);
        assertNotNull(node.getElement());
    }

    @Test
    public void getElement() {
        node.setElement(12);
        assertEquals(node.getElement(), 12);
    }

    @Test
    public void addLeftChild() {
        BinaryTreeNode<Integer> newLeftNode = new BinaryTreeNode<>(3);
        node.addLeftChild(newLeftNode);
        assertNotNull(node.getLeftChild());
    }

    @Test
    void addRightChild() {
        BinaryTreeNode<Integer> newRightNode = new BinaryTreeNode<>(4);
        node.addRightChild(newRightNode);
        assertNotNull(node.getRightChild());
    }
}