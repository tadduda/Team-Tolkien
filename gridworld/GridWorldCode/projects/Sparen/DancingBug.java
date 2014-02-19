import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
    private int[] input;
    private int inputlength;
    private int counter = 0;

    public DancingBug(int[] input){
	this.input = input;
	inputlength = input.length;
    }

    public void act(){
        if (canMove()){
            move();
        }
	for(int i = 0; i<input[counter]; i++){
	    turn();
	}
	counter++;
	if(counter>=inputlength){
	    counter%=inputlength;
	}
    }
}
