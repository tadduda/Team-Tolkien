
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
	int[] rand = new int[7];
	for(int i = 0; i<7; i++){
	    rand[i]=(int)(Math.random()*8);
	}
        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(rand);
        world.add(new Location(2, 8), alice);
        world.show();
    }
}
