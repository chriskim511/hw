public class MyLinkedList<E> implements Iterable<E>{
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(){
	head = null;
	tail = null;
	length = 0;
    }

    public iterator<E>(){
	return new MyLLIterator<E>(head);
    }

    public void add(E d){
	if(head == null){
	head = new Node(d);
	tail = head;
	}else{
	    Node temp = head;
	    while(temp.getNext() != null){
		temp = temp.getNext();
	    }
	    temp.setNext(new Node(d));
	    tail = temp.getNext();
	}
	length++;
    }
    
    public String toString(){
        String s = "";
	Node tmp = head;
	while (tmp != null) {
	    s += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return s;
    }

    //add @ location i (0 at front)
    //error if you try to add part to the end
    public void add(int i, E s){
	if(i >= length() - 1){
	    throw new IndexOutOfBoundsException();
	}
	Node temp = head;
	if(i == 0){
	    add(s);
	}
	if(i == length - 1){
	    tail.setNext(new Node(s));
	    tail = tail.getNext();
	}
	while(i != 1){
	    temp = temp.getNext();
	    i -= 1;
	}
	Node temp2 = temp.getNext();
	temp.setNext(new Node(s));
	temp.getNext().setNext(temp2);
	length++;
    }

    //returns the String @ location i
    public E get(int i){
	if(i >= length - 1){
	    throw new IndexOutOfBoundsException();
	}
	Node temp = head;
	if(i == 0){
	    return temp.getData();
	}
	while(i > 0){
	    temp = temp.getNext();
	    i -= 1;
	}
	return temp.getData();
    }
    
    public E set(int i, E s){
	String resp = "";
	if(i >= length()){
	    throw new IndexOutOfBoundsException();
	}
	Node temp = head;
	if(i == 0){
	    Node hold = head.getNext();
	    add(s);
	    head.setNext(hold);
	}
	while(i != 1){
	    temp = temp.getNext();
	    i -= 1;
	}
	resp += temp.getNext().getData();
	temp.setNext(new Node(s));
	temp.getNext().setNext(temp.getNext().getNext());
	if(i == length - 1){
	    resp = tail.getData();
	    tail = temp.getNext();
	}
	return resp;
    }

    //remove and return the String at i, exception on error
    public E remove(int i){
	int n = 0;
	String resp = "";
	Node temp = head.getNext();
	Node t2 = head;
	if(i == 0){
	    resp += head.getData();
	    head = head.getNext();
	    return resp;
	}
	if(i >= length() - 1){
	    throw new IndexOutOfBoundsException();
	}
	while(n < i){
	    t2 = temp;
	    resp += temp.getData();
	    temp=temp.getNext();
	    n++;
	}
	t2.setNext(temp.getNext());
	return resp;
    }

    public int find(String s){
	Node pos = head;
	for(int i = 0; i < length; length++){
	    if(pos.getData().equals(s)){
		return i;
	    }
	    pos = pos.getNext();
	}
	return -1;
    }
    
    public int length(){
	return length;
    }	
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();

	L.add("Sully");
	System.out.println(L);
	L.add("Mike"); 
	System.out.println(L);
	L.add("Randall");
	System.out.println(L);
	L.add("Boo");
	System.out.println(L);
	L.set(3, "hi");
	System.out.println(L);
    }
}
