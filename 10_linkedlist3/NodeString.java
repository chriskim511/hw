public class NodeString {
    
    private String data;
    private NodeString next;
    
    public NodeString(String d) {
	data = d;
    }
    public void setData(String d) {
	data = d;
    }
    public String getData() {
	return data;
    }
    public void setNext(NodeString n) {
	next = n;
    }
    public NodeString getNext() {
	return next;
    }
    public String toString() {
	return data;
    }
    public static void main(String[] args) {
	NodeString n1 = new NodeString("Sully");
	NodeString n2 = new NodeString("Mike");
	System.out.println(n1);
	System.out.println(n2);

	n1.setNext(n2);
	System.out.println(n1.getNext());
	n1.getNext().setNext( new NodeString("Randall") );
	System.out.println();
	System.out.println(n2.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println();
	/*
	  n1.setNext(n1.getNext().getNext() );
	  System.out.println();
	  System.out.println(n1);
	  System.out.println(n1.getNext());
	  System.out.println(n1.getNext().getNext());
	*/
	n1.getNext().getNext().setNext(n1);
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());

	

    }
}