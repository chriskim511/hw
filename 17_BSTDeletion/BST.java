public class BST {
    private Node root;
    public Node search(int i) {
	Node n = root;
	while (n != null && n.getData() != i) {
	    if (n.getData() > i)
		n = n.getLeft();
	    else 
		n = n.getRight();
	}
	return n;
    }

    public void insert(Node n) {
	Node c = root;
	Node d = null;
	while (d == null) {
	    if (c.getData() > n.getData()) {
		if (c.getLeft() == null) 
		    d = c;
		else 
		    c = c.getLeft();
	    }
	    else {
		if (c.getRight() == null) 
		    d = c;
		else
		    c = c.getRight();
	    }
	}
	if (n.getData() < d.getData()) 
	    d.setLeft(n);
	else
	    d.setRight(n);
    }
    public Node delete(int data) {
        Node n = search(data);
        
        if ( n == null )
            return n;
        else if ( (n.getLeft() == null) && (n.getRight() == null) )
	    {
		n = null;
		return n;
	    }
        else if ( (n.getLeft() != null) && (n.getRight() == null) )
	    {
		n = n.getLeft();
		n.setLeft(null);
		return n;
	    }
        else if ( (n.getLeft() == null) && (n.getRight() != null) )
	    {
		n = n.getRight();
		n.setRight(null);
		return n;
	    }
	else {
	    return n;
	}
    }
}