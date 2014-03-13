/*Christopher Kim
Part 3:
Group Activity
1. Specify: 
a. If the location two cells in front contains a rock, the jumper will not be able to move to its designated location, but will instead stop at the first step and turn 45 degrees to the right. If the location is a flower, it will be able to go on the spot.
b. If the location two cells in front of the jumper is out of the grid, it will turn right 45 degrees when it encounters the out of bounds area. 
c. If a jumper faces an edge, it will turn right 45 degrees twice, thus creating a right turn.
d. If another actor is in the cell that is two cells in front of the jumper, it will not be able to move to that location and will turn 45 degrees to the right.
e. Since the jumper is not a rock or a flower, the jumper will not be able to pass the other jumper, and will turn right 45 degrees.
f. The jumper will also need to see if there are actors right in front of it, and if there are double rocks in front of it, etc.

2. Design
a. Jumper should extend the Bug class.
b. Boxbug class is similar to the Jumper class.
c. Parameters are not really needed.
d. act() needs to be overriden, as well as move() and canMove().
e. methods do not need to be added here.
f. We’ll need to place different actors on the grid, and will also have to check for cases where the jumper will go out of bounds.
3. Code:*/

public class Jumper extends Bug {

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (canMove())
	    {
		move();
	    }
        else
	    {
		turn();
	    }
    }
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
	Location final = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(final))
            return false;
        Actor neighbor = gr.get(final);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }
}
