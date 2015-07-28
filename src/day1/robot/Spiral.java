package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot and set its pen to the down position
		Robot Bill = new Robot ();
		Bill.penDown();
		// 3. Set the robot to go at max speed (10)
		Bill.setSpeed(10);
		// 4. Do the following (steps 5-8) 75 times
		for (int i = 0; i < 1000; i++) {
		
		
			// 6. Change the pen color to random
			Bill.setRandomPenColor();
			// 5. Move the robot 5 times the current line number you are drawing (5*i)
			Bill.move(2*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			Bill.turn(360/7);
			
			// 7. Change the number of sides to 7 (don’t add a new line of code for this one!)
			
			// 8. Set the pen width to i
			Bill.setPenWidth(i);
		}
	}
}
