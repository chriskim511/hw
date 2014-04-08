public class MyStack{

    private String[] stack;
    private int top;
    private int len;

    //constructor
    //initialize an empty String Array 10 elements long

    public MyStack(){
	stack = new String[10];
	top = 0;
	len = 0;
    }

    public void push(String s){
	if (len == stack.length){
	    String[] temp = new String[len+1];
	    for(int x = 0 ; x < len ; x++){
		temp[x] = stack[x];
	    }
	    temp[len] = s ;
	    stack = temp ;
	}
	else{
	    stack[len] = s;
	}
	len++;
	top++;
    }

    public String pop() {
	String answer = stack[len-1];
	len--;
	top--;
	return answer;
    }

    public String peek() {
	return stack[len-1];
    }

    public int size() {
	return len;
    }

    public boolean isEmpty() {
	return len == 0;
    }

    public String toString() {
	String answer = "";
	for(int x = 0 ; x < len; x++){
	    answer += stack[x] + ", " ;
	}
	return answer.substring(0,answer.length()-2);
    }
    public static void main(String[] args){
	MyStack test = new MyStack();
	System.out.println(test.isEmpty());
	test.push("my");
	test.push("name");
	System.out.println(test);
	test.push("is");
	test.push("Goober");
	System.out.println(test);
	System.out.println(test.size());
	System.out.println(test.isEmpty());
	System.out.println(test.peek());
	System.out.println(test.pop());
	System.out.println(test);
    }
}