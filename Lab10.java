/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 

public class Lab10 {
	 
	 public static void main(String[] args) {
		 Display.openWorld("maps/maze1.map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
		 clearMaze(athena);
	 }
	 
	 public static void clearMaze(Athlete arg) {
		 while(!arg.nextToABeeper()) {
			 if(!arg.leftIsClear()) {  // left hand is on wall
				 if (arg.frontIsClear()) {
					 arg.move();
				 } else {
					 arg.turnRight();
				 }
			 }  else { // left hand not on wall
				 arg.turnLeft();
				 arg.move();
			 }
		 }
	 }
 }