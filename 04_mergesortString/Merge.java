import java.util.ArrayList;

public class Merge {
    
    public static String print(ArrayList<Comparable> x) {
	String ans = "";
	for (Comparable y : x) {
	    ans += y + ", ";
	}
	ans = ans.substring(0,ans.length()-2);
	return ans;
    }
    // parameters are assumed to be sorted
    private static ArrayList<Comparable> Merger(ArrayList<Comparable> a, ArrayList<Comparable> b)
    {
        ArrayList<Comparable> ans = new ArrayList<Comparable>();
        
        while ( (a.size() > 0) && (b.size() > 0) ) {
            if ( a.get(0).compareTo( b.get(0) ) <= 0 )
            {
                ans.add( a.get(0) );
                a.remove(0);
            }
            else
            {
                ans.add( b.get(0) );
                b.remove(0);
            }
        }
        
        while (a.size() > 0)
        {
            ans.add( a.get(0) );
            a.remove(0);
        }
        while (b.size() > 0)
        {
            ans.add( b.get(0) );
            b.remove(0);
        }
        
        return ans;
    }
    public static ArrayList<Comparable> mergesort(ArrayList<Comparable> L) {
	if (L.size() <= 1) {
	    return L;
	}
	else {
	    int length = L.size() / 2;
	    ArrayList<Comparable> a = new ArrayList<Comparable>();
	    ArrayList<Comparable> b = new ArrayList<Comparable>();
	    int i;
	    for (i = 0; i < length; i++) {
		a.add(L.get(i));
	    }
	    for (; i < L.size(); i++) {
		b.add(L.get(i));
	    }
	    ArrayList<Comparable> f1 = mergesort(a);
	    ArrayList<Comparable> f2 = mergesort(b);
	    return Merger(f1,f2);
	}
    }
	    
    public static void main(String[] args) {
	ArrayList<Comparable> bob = new ArrayList<Comparable>();
	bob.add("hi");
	bob.add("ay");
	bob.add("babe");
	bob.add("zboss");
	System.out.println(print(mergesort(bob)));
    }
}
		