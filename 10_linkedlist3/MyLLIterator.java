public class MyLLIterator<E> implements Iterator{
    private Node current;

    public MyLLIterator(Node n){
	current = n;
    }

    public boolean hasNext(){
	if(current.getNext() != null){
	    return true;
	}
	return false;
    }

    public E next(){
	return current.getNext();
    }
    
    public void remove(){}
}