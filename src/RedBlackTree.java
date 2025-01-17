import java.util.LinkedList;

/**
 * RedBlackTree
 * Description: Simulates a simple binary search tree using linked nodes.
 * Each node is represented as an object of an inner class.
 * Note: This is a simplified version for educational purposes and does not
 *       maintain Red-Black properties such as balancing and color assignment.
 * @author Daniel Mwangi
 */

public class RedBlack {

    // Inner class representing a tree node
    private class Node {
        int key;
        Node left, right, parent;

        Node(int key, Node parent) {
            this.key = key;
            this.left = null;
            this.right = null;
            this.parent = parent;
        }
    }

    private Node root;

    public RedBlackTreeLinkedList() {
        this.root = null;
    }

    // Insert a new key into the tree
    public void insert(int key) {
        if (root == null) {
            root = new Node(key, null);
        } else {
            Node current = root;
            Node parent = null;

            while (current != null) {
                parent = current;
                if (key < current.key) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            if (key < parent.key) {
                parent.left = new Node(key, parent);
            } else {
                parent.right = new Node(key, parent);
            }
        }
    }

    // Inorder traversal to print tree keys
    public void inorder() {
        inorderHelper(root);
    }

    private void inorderHelper(Node node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.key + " ");
            inorderHelper(node.right);
        }
    }

    // Search for a key in the tree
    public boolean search(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.key) {
                return true;
            } else if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RedBlackTreeLinkedList tree = new RedBlackTreeLinkedList();
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(6);
        tree.insert(15);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\nSearch for 15: " + tree.search(15));
        System.out.println("Search for 25: " + tree.search(25));
    }
}
