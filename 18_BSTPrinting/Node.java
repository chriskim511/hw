// worked with Anmolpreet

public class Node {
    private int data;
    private Node left, right;
    
    public Node() {
	data = 0;
	left = null;
	right = null;
    }
    
    public Node(int d) {
	data = d;
	left = null;
	right = null;
    }
   
    public void setLeft(Node x) {
	left = x;
    }
    
    public void setRight(Node x) {
	right = x;
    }

    public int getData() {
	return data;
    }
    
    public Node getLeft() {
	return left;
    }
    
    public Node getRight() {
	return right;
    }

    public String toString() {
	return "" + data;
    }
}