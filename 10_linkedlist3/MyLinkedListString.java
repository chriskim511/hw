// Worked with Adriel Mendoza Pd 2

public class MyLinkedListString{
    private NodeString head;
    private NodeString tail;
    private int length;

    public MyLinkedListString(){
	head = null;
	tail = null;
	length = 0;
    }

    public void add(String d){
	if(head == null){
	    head = new NodeString(d);
	    tail = head;
	}else{
	    NodeString temp = head;
	    while(temp.getNext() != null){
		temp = temp.getNext();
	    }
	    temp.setNext(new NodeString(d));
	    tail = temp.getNext();
	}
	length++;
    }
    
    public String toString(){
        String s = "";
	NodeString tmp = head;
	while (tmp != null) {
	    s += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return s;
    }

    //add @ location i (0 at front)
    //error if you try to add part to the end
    public void add(int i, String s){
	if(i >= length() - 1){
	    throw new IndexOutOfBoundsException();
	}
	NodeString temp = head;
	if(i == 0){
	    add(s);
	}
	if(i == length - 1){
	    tail.setNext(new NodeString(s));
	    tail = tail.getNext();
	}
	while(i != 1){
	    temp = temp.getNext();
	    i -= 1;
	}
	NodeString temp2 = temp.getNext();
	temp.setNext(new NodeString(s));
	temp.getNext().setNext(temp2);
	length++;
    }

    //returns the String @ location i
    public String get(int i){
	if(i >= length - 1){
	    throw new IndexOutOfBoundsException();
	}
	NodeString temp = head;
	if(i == 0){
	    return temp.getData();
	}
	while(i > 0){
	    temp = temp.getNext();
	    i -= 1;
	}
	return temp.getData();
    }
    
    public String set(int i, String s){
	String resp = "";
	if(i >= length()){
	    throw new IndexOutOfBoundsException();
	}
	NodeString temp = head;
	if(i == 0){
	    NodeString hold = head.getNext();
	    add(s);
	    head.setNext(hold);
	}
	while(i != 1){
	    temp = temp.getNext();
	    i -= 1;
	}
	resp += temp.getNext().getData();
	temp.setNext(new NodeString(s));
	temp.getNext().setNext(temp.getNext().getNext());
	if(i == length - 1){
	    resp = tail.getData();
	    tail = temp.getNext();
	}
	return resp;
    }

    //remove and return the String at i, exception on error
    public String remove(int i){
	int n = 0;
	String resp = "";
	NodeString temp = head.getNext();
	NodeString t2 = head;
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
	NodeString pos = head;
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
	MyLinkedListString L = new MyLinkedListString();

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
