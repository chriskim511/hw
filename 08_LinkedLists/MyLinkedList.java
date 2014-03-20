public class MyLinkedList {
    
    private Node head;
    
    public MyLinkedList() {
	head = null;
    }

    public void add(String d) {
	Node temp = new Node(d);
	temp.setNext(head);
	head = temp;
    }
    public int length() { 
	int len = 0;
	Node temp = head;
	while (temp != null) {
	    len += 1;
	    temp = temp.getNext();
	}
	return len;
    }
    public int find(String s) {
	Node temp = head;
	int i = -1;
	while (temp != null) {
	    i += 1;
	    if (temp.getData().equals(s)) {
		return i;
	    }
	    temp = temp.getNext();
	}
	return -1;
    }
    public String get(int a) {
	Node temp = head;
	int i = -1;
	while (temp != null) {
	    i+= 1;
	    if (i == a) {
		return temp.getData();
	    }
	    temp = temp.getNext();
	}
	return "out of bounds";
    }	
    public String remove(int a) {
	String n = "";
	int i = -1;
	Node temp = head;
	while (temp != null) {
	    i+= 1;
	    if (i == (a-1)) {
		n = temp.getNext().getData();
		temp.setNext(temp.getNext().getNext());
	    }
	    temp = temp.getNext();
	}
	return n;
    }
    public void add(int a, String s) {
	int i = -1;
	Node temp = head;
	Node newnode = new Node(s);
	while (temp != null) {
	    i+= 1;
	    if (i == a-1) {
		newnode.setNext(temp.getNext());
		temp.setNext(newnode);
	    }
	    temp = temp.getNext();
	}
    }
    public String set(int a, String s) {
	int i = -1;
	String n = "";
	Node newnode = new Node(s);
	Node temp = head;
	while (temp != null) {
	    i+= 1;
	    if (i == a-1) {
		n = temp.getNext().getData();
		newnode.setNext(temp.getNext().getNext());
		temp.setNext(newnode);
	    }
	    temp = temp.getNext();
	}
	return n;
    }
	
    public String toString() {
	String s = "";
	//special code : temp = temp.getNext() you'll need to make a temp which will start at head.getNext()
	Node temp = head;
	while (temp != null) {
	    s = s + temp + " ";
	    temp = temp.getNext();
	}
	    return s;
    }
    public static void main(String[] args) {
	MyLinkedList L = new MyLinkedList();
	System.out.println(L.length());
	L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	System.out.println(L);
	L.add("Randall");
	L.add("works");
	System.out.println(L);
	System.out.println();
	System.out.println(L.get(2));
	L.set(2, "yoo");
	System.out.println( L );

	L.remove(2);
	System.out.println( L );

	System.out.println( L.find( "Mike" ) );
	System.out.println( L.length() );
    }
}