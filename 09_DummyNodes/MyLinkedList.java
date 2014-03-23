public class MyLinkedList {
    
    private Node head;
    
    public MyLinkedList() {
	head = new Node("");
    }

    public void add(String d) {
	Node temp = new Node(d);
	temp.setNext(head.getNext());
	head.setNext(temp);
    }
    public int length() { 
	int len = 0;
	Node temp = head.getNext();
	while (temp != null) {
	    len += 1;
	    temp = temp.getNext();
	}
	return len;
    }
    public int find(String s) {
	Node temp = head.getNext();
	int i = 0;
	while (i < length()) {
	    i += 1;
	    if (temp.getData().equals(s)) {
		return i;
	    }
	    temp = temp.getNext();
	}
	return -1;
    }
    public String get(int a) {
	Node temp = head.getNext();
	int i = 0;
	while (i < a) {
	    temp = temp.getNext();
	    i += 1;
	}
	return temp.getData();
    }
    public String remove(int a) {
	String n = "";
	int i = 0;
	Node temp1 = head.getNext();
	Node temp2 = temp1.getNext();
	while (i < a - 1) {
	    i+= 1;
	    temp1 = temp1.getNext();
	    temp2 = temp2.getNext();
	}
	n = temp2.getData();
	temp1.setNext(temp2.getNext());
	return n;
    }
    public void add(int a, String s) {
	int i = 0;
	Node temp1 = head.getNext();
	Node temp2 = temp1.getNext();
	Node newnode = new Node(s);
	while (i < a - 1) {
	    temp1 = temp1.getNext();
	    temp2 = temp2.getNext();
	}
	newnode.setNext(temp2);
	temp1.setNext(newnode);
    }
    public String set(int a, String s) {
	int i = 0;
	String n = "";
	Node newnode = new Node(s);
	Node temp = head.getNext();
	while (i < a) {
	    i+= 1;
	    temp = temp.getNext();
	}
	n = temp.getData();
	temp.setData(s);
	return n;
    }

    public String toString() {
	String s = "";
	//special code : temp = temp.getNext() you'll need to make a temp which will start at head.getNext()
	Node temp = head.getNext();
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