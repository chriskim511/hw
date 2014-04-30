// Worked with Anmolpreet 
public class BST {
    private Node root;

    public BST() {
	root = null;
    }

    public Node search(int i) {
	Node n = root;
	while (n != null && n.getData() != i) {
	    if (n.getData() < i)
		n = n.getRight();
	    else 
		n = n.getLeft();
	}
	return n;
    }

    public Node search2(Node c, int x) {
	if (c == null) {
	    return null;
	}
	else if (x < c.getData()) {
	    return search2(c.getLeft(), x);
	}
	else if (x > c.getData()) {
	    return search2(c.getRight(), x);
	}
	else {
	    return null;
	}
    }



    public void insert(Node n) {
	Node x = root;
	Node y = null;
	while (y == null) {
	    if (x.getData() < n.getData()) {
		if (x.getRight() == null) 
		    y = x;
		else 
		    x = x.getRight();
	    }
	    else {
		if (x.getLeft() == null) 
		    y = x;
		else
		    x = x.getLeft();
	    }
	}
	if (n.getData() > y.getData()) 
	    y.setRight(n);
	else
	    y.setLeft(n);
    }

    public void delete(int x) {
	Node a = search2(root, x);
	if (a == null) {

	}
	else if ((a.getLeft() == null) && (a.getRight() == null)) {
	    a = null;

	}
	else if ((a.getRight() != null) && (a.getLeft() == null)) {
	    a = a.getRight();
	    a.setRight(null);

	}
	else if ((a.getRight() == null) && (a.getLeft() != null)) {
	    a = a.getLeft();
	    a.setLeft(null);

	}
	else {
	}
    }

    public void traverse (Node n) {
	if (n.getLeft() != null) {
	    traverse(n.getLeft());
	}
	else {
	    System.out.println(n.getLeft().getData());
	}
	if (n.getRight() != null) {
	    traverse(n.getRight());
	}
	else {
	    System.out.println(n.getRight().getData());
	}
    }
    

}