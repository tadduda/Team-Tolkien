import info.gridworld.actor.Bug;

public class ZBug extends Bug{
    private int steps;
    private int sideLength;
    private int phase;

    public ZBug(int length){
        steps = 0;
        sideLength = length;
	setDirection(90);
	phase = 0;
    }

    public void act(){
        if (steps <= sideLength && canMove() && phase!=3){
            move();
            steps++;
        }else{
	    if(phase == 0){//East
		turn(); turn(); turn();
		phase = 1;
	    }else if(phase==1){
		turn(); turn(); turn();
		phase = 2;
	    }else if(phase==2){
		phase = 3;
	    }
            steps = 0;
        }
    }
}
