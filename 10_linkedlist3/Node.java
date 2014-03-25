public class Node<E>{
    private E data;
    private Node next;

    public Node(E d){
	data = d;
	next = null;
    }

    public void setData (E d){
	data = d;
    }

    public E getData(){
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return data.toString();
    }
}