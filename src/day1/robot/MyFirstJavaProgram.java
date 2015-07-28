package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		
Robot Billy = new Robot();
Billy.penDown();
Billy.setPenWidth(50);
Billy.setRandomPenColor();
Billy.setSpeed(10000);
for (int i = 0; i < 4; i++) {
Billy.move(200);
Billy.turn(90);
Billy.setRandomPenColor();
}
Billy.turn(180);
for (int i = 0; i < 4; i++) {
Billy.move(200);
Billy.turn(270);
Billy.setRandomPenColor();
}
for (int i = 0; i < 4; i++) {
Billy.move(200);
Billy.turn(90);
Billy.setRandomPenColor();
}
Billy.turn(180);
for (int i = 0; i < 4; i++) {
Billy.move(200);
Billy.turn(270);
Billy.setRandomPenColor();
}
	}
}
