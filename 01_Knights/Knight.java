import java.io.*;
import java.util.*;

public class Knight
{
    public int[][] board;
    public int h;
    public boolean solved = false;
    public int knight;
    public int path = 0;
    public Knight(int n) {
	board = new int[n+4][n+4];
	for (int i = 0; i < n + 4; i++) {
	    for (int j = 0; j < n + 4; j++) {
		board[i][j] = -1;
	    }
	}
	for (int i = 2; i < n + 2; i ++) {
	    for (int j = 2; j < n + 2; j++) {
		board[i][j] = 0;
	    }
	}
	knight = 1;
	h = n + 4;
    }
    public String toString() {
	String s = "";
	int i,j;
	for (i = 0; i < h; i++) {
	    for (j = 0; j < h; j++) {
		s = s + String.format("%3d", board[j][i]);
	    } 
	    s = s + "\n";
	}
	return s;
    }
    private void delay(int n)
    {
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }
    public void solve(int x, int y) {
	if (knight == h * h + 1) {
	    System.out.println(this);
	}
	else if (board[x][y] == 0) {
	    //delay(1300);
	    board[x][y] = knight;
	    //System.out.println(this);
	    knight += 1;
	    solve(x+2, y+1);
	    if (!solved){
		solve(x+2, y-1);
	    }
	    if (!solved){
		solve(x-2, y+1);
	    }		
	    if (!solved){
		solve(x-2, y-1);
	    }
	    if (!solved){
		solve(x+1, y+2);
	    }
	    if (!solved){
		solve(x+1, y-2);
	    }
	    if (!solved){
		solve(x-1, y+2);
	    }
	    if (!solved){
		solve(x-1, y-2);
	    }
	    knight -= 1;
	    board[x][y] = 0;
	}
    }
    public static void main(String[] args) {
	Knight m = new Knight(5);
	System.out.println(m);
	m.solve(2,2);
	System.out.println(m);
    }
}
