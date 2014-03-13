import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private int[] turns;
    private int turn;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] steppers)
    {
        turns = steppers;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (turn >= turns.length) {
	    turn = 0;
        }
	int x = turns[turn];
	while (x > 0)
	    {
		turn();
		x—;
	    }
        move();
        turn++;
    }
}
