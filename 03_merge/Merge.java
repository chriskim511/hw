public class Merge {
    
    public static String print(int[] x) {
	String ans = "";
	for (int y : x) {
	    ans += y + ",";
	}
	ans = ans.substring(0,ans.length()-1);
	return ans;
    }
    // parameters are assumed to be sorted
    public static int[] Merger(int[] a, int[] b) {
	int m = 0;
	int n = 0;
	int[] c = new int[a.length + b.length];
	for (int i = 0; i < c.length; i++) {
	    if (m == a.length || n == b.length) {
		if (m == a.length) {
		    c[i] = b[n];
		    n += 1;
		}
		else {
		    c[i] = a[m];
		    m += 1;
		}
	    }
	    else if (a[m] < b[n]) {
		c[i] = a[m];
		m += 1;
	    }
	    else {
		c[i] = b[n];
		n += 1;
	    }
	}
	return c;
    }
    public static int[] mergesort(int[]L) {
	if (L.length <= 1) {
	    return L;
	}
	else {
	    int[] a = new int[L.length/2];
	    int[] b = new int[L.length - a.length];
	    int i;
	    for (i = 0; i < a.length; i++) {
		a[i] = L[i];
	    }
	    for (i = 0; i < b.length; i++) {
		b[i] = L[i + a.length];
	    }
	    int[] f1 = mergesort(a);
	    int[] f2 = mergesort(b);
	    return Merger(f1,f2);
	}
    }

    public static void main(String[] args) {
	int[] bob = new int[3];
	bob[0] = 0;
	bob[1] = 3;
	bob[2] = 4;
	int[] sally = new int[6];
	sally[0] = 4;
	sally[1] = 1;
	sally[2] = 3;
	sally[3] = 88;
	sally[4] = 2;
	sally[5] = 9;
	System.out.println(print(mergesort(sally)));
    }
}
