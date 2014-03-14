import java.util.*;

// might as well just do it for comparables
public class QuickSort {
    public static ArrayList<Comparable> quicksort( ArrayList<Comparable> x ) {
	
	if ( x.size() <= 1 ){
	    return x;
	}
	int p = (int) (Math.random() * x.size() );
	ArrayList<Comparable> l = new ArrayList<Comparable>();
	ArrayList<Comparable> u = new ArrayList<Comparable>();
	int i;
	for (i = 0; i < x.size(); i++) {
	    if ( x.get(i).compareTo(x.get(p)) < 0 ) {
		l.add( x.get(i) );
	    }
	    else if (x.get(i).compareTo(x.get(p)) > 0) {
		u.add( x.get(i) );
	    }
	}

	ArrayList<Comparable> r1 = quicksort(l); 
	ArrayList<Comparable> r2 = quicksort(u);

        ArrayList<Comparable> ans = new ArrayList<Comparable>();
 
	for (i = 0; i < r1.size(); i++) {
	    ans.add(r1.get(i));
	}
	ans.add(x.get(p));

	for (i = 0; i < r2.size(); i++) {
	    ans.add(r2.get(i));
	}

	return ans;
    }
    public static void main(String[] args) { 
	ArrayList test = new ArrayList<Comparable>();
	test.add(5);
	test.add(3);
	test.add(8);
	test.add(16);
	test.add(9);
	test.add(4);
	test.add(2);
	test.add(17);
	test.add(11);
	System.out.println(test);
	System.out.println(quicksort(test));
    }
}