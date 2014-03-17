public class Quicksort2 {

    public static void quickSort( int[] x, int l, int r) {

	if (x.length > 1) {
	    int p = (int) ((Math.random() * (r-l + 1)) + l);
	    int val = x[p];
	    x[p] = x[r];
	    x[r] = val;
	    int wall = l;
	    int z;
	    for (int i = l; i < r; i++) {
		if ( x[i] < val ) {
		    z = x[wall];
		    x[wall] = x[i];
		    x[i] = z;
		    wall++;
		}
	    }
	    x[r] = x[wall];
	    x[wall] = val;
	    if (wall - 1 > l) {
		quickSort(x, l, wall - 1);
	    }
	    if (wall + 1 < r) {
		quickSort(x, wall + 1, r);
	    }
	}
    }

    public static void qsort( int[] x ) {
	quickSort(x, 0, x.length-1);
    }

    public static String print( int[] x ) {
	String ans = "";
	for (int i = 0; i < x.length; i++) {
	    ans += x[i] + ",";
	}
	return ans;
    }

    public static void main( String[] args ) {

	int[] test = {14,1,2,20,3,5};
	System.out.println(print(test));
	qsort(test);
	System.out.println(print(test));

    }
}