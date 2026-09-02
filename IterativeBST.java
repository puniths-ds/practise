package programs;

public class IterativeBST {
	class Node {
	    int data;
	    Node left, right;

	    public Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}
    Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    
    public void preorder(Node node) {
    	if (node!=null) {
    		preorder(node.right);
    		System.out.print(node.data+" ");
    		preorder(node.left);
    	}
    }

    public static void main(String[] args) {
        IterativeBST bst = new IterativeBST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal:");
        bst.inorder(bst.root);
        
        System.out.println("\nPreorder traversal:");
        bst.preorder(bst.root);
    }
}
