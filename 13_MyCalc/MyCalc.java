public class MyCalc {

    private Node top;
    private int numElts;

    public MyCalc(){
	top = null;
	numElts = 0;
    }

    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElts = numElts+1;
    }

    public String pop() {
	String ret = top.getData();
	top = top.getNext();
	numElts = numElts-1;
	return ret;
    }

    public String peek() {
	return top.getData();

    }
    
    public int size() {
	return numElts;
    }

    public boolean isEmpty() {
	return top==null;
    }
    public void myCalculator(String s){
	if (s.equals("+")){
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp + Double.parseDouble(this.pop());    
	    this.push("" + ans);
	    numElts = numElts - 1;
	}

	else if(s.equals("-")){
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp - Double.parseDouble(this.pop());
	    this.push("" + ans);
	    numElts = numElts - 1;
	}
	else if(s.equals("*")){
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp * Double.parseDouble(this.pop());
	    this.push("" + ans);
	    numElts = numElts - 1;
	}
	else if (s.equals("/")){
	    double temp = Double.parseDouble(this.pop());
	    double ans = temp / Double.parseDouble(this.pop());
	    this.push("" + ans);
	    numElts = numElts -1;

	}
	else{
	    this.push(s);
	    numElts = numElts +1;
	}

    }
    
    public String toString() {
	String s = "";
	for (Node tmp = top; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp.getData()+", ";
	}
	return s.substring(0,s.length()-2);
    }
    public static void main(String[] args){
	MyCalc m = new MyCalc();
	m.push("6");
	m.push("4");
	m.myCalculator("+");
	System.out.println(m);
	m.push("2");
	m.myCalculator("/");
	System.out.println(m);
	//m.push("10");
	//System.out.println(m);
	//m.myCalculator("-");
	//System.out.println(m);
    }
}