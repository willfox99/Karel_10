/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author Will Fox
 * @version 4/ 12 / 14 
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane; 

public class Lab10 {
	 
	 public static void main(String[] args) {
		 		 String number = JOptionPane.showInputDialog("Which maze map? Put number (1, 2 or 3).");
		 Display.openWorld("maps/maze" + number + ".map");
		 Display.setSize(10, 10);
		 Display.setSpeed(10);
             Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
		 clearMaze(athena);
	 }
	 
	 public static void clearMaze(Athlete arg) {
    
		 if(arg.rightIsClear()) {
            arg.turnRight();
            arg.move();
       } else if(arg.frontIsClear()) {
            arg.move();
       } else if(arg.leftIsClear()) {
            arg.turnLeft();
            arg.move();
       } else {
            arg.turnAround();
            arg.move();
       }
	 }
 }