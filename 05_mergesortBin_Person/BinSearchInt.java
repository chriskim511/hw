public class BinSearchInt {


    public static int binSearch ( int[] a, int target ) {
	//uncomment exactly 1 of the 2 stmts below:
	return binSearchIter( a, target, 0, a.length-1 );
	//return binSearchRec( a, target, 0, a.length-1 );
    }

    public static int binSearchRec( int[] a, int target, int lo, int hi ) {
	if (((hi-lo) == 0) && (target != lo)) {
	    return -1;
	}
	else if (a[(hi-lo)/2] == target) {
	    return (hi-lo)/2;
	}
	else if (a[(hi-lo)/2] > target) { 
	    return binSearchRec(a,target,(hi-lo)/2,hi);
	}
	else {
	    return binSearchRec(a,target,lo,(hi-lo)/2);
	}    
    }

    public static int binSearchIter( int[] a, int target, int lo, int hi ) {
       
	while (a[(hi-lo)/2] != target) {
	    if (lo == hi && lo != target) {
		return -1;
	    }
	    else if (a[(hi-lo)/2] > target) {
		lo = (hi-lo)/2;
	    }
	    else {
		hi = (hi-lo)/2;
	    }
	}
	return (hi-lo)/2;
    }



    private static boolean isSorted( int[] arr ) {
	int n = 0;
	while (n < arr.length-1) {
	    if (( arr[n]) > (arr[n+1])) {
		return false;
	    }
	    n += 1;
	}
	return true;
    }


    private static void printArray( int[] arr ) {
	String output = "[ "; 

	for( int i : arr )
	    output += i + ", ";

	output = output.substring( 0, output.length()-2 ) + " ]";

	System.out.println( output );
    }


    public static void main ( String[] args ) {

	System.out.println("\nNow testing binSearch on int array...");


	int[] iArr = { 2, 4, 6, 8, 6, 42 };
	printArray( iArr );
	System.out.println( "sorted? -- " + isSorted(iArr) );

	int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
	printArray( iArr2 );
	System.out.println( "sorted? -- " + isSorted(iArr2) );

	System.out.println( binSearch(iArr,6) );

	System.out.println( binSearch(iArr,43) );

    }

}