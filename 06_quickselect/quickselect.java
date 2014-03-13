public class quickselect {
    
    public static void print(int[] a) {
	for (int x: a) {
	    System.out.print(x + ", ");
	}
	System.out.println();
    }
    public static int quickselect(int[] a, int k, int lo, int hi) {
	if (lo >= hi) {
	    return lo;
	}
	else {
	    int p = (lo+hi)/2;
	    int[] b = new int[a.length];
	    int i;
	    int c = lo;
	    int c2 = hi;
	    for (i = lo; i < p; i++) {
		if (a[i] < a[p]) {
		    b[c] = a[i];
		    c += 1;
		}
		else {
		    b[c2] = a[i];
		    c2 -= 1;
		}
	    }
	    for (i = p + 1; i <= hi; i++) {
		if (a[i] > a[p]) {
		    b[c2] = a[i];
		    c2 -= 1;
		}
		else {
		    b[c] = a[i];
		    c += 1;
		}
	    }
	    b[c2] = a[p];
	    print(b);
	    if (c == k) {
		return b[c];
	    }
	    else if (b[c] > k) {
		hi = c;
	    }
	    else {
		lo = c;
	    }
	
	    return quickselect(b, k, lo, hi);
	}
    }
    public static void main(String[] args) {
	int[] iArr = { 0, 4, 2, 1, 3, 5, 9, 6, 8, 7 };
	print(iArr);
	System.out.println( quickselect(iArr,6,0,iArr.length - 1) );
    }
}

				
		    