package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		
		
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		
		int i = 0;
		while (1 < 5) {
		    
			int count = 0;
			
			
			rob.setRandomPenColor();
			rob.penDown();
			rob.move(70);
			 rob.turn(360/7);
              count +=1;
        	
			
		}   
		
	
		
		
		
		
		
		
		
		
		
		
		
		// Create a new Robot
		
		// Set your robot's pen down 
		
		// SPEED. Set the robot to go at max speed (100)

		// COUNT. Create an int variable that will count how many lines of the spiral we have drawn.
			//        Start its value as zero.

		// LOOP. Start a while loop to repeat the COLOR, DRAW, TURN, and COUNT code below until 50 lines have been drawn

			// COLOR.   Have the robot set a random pen color:      setRandomPenColor()

			// DRAW.    Move the robot (5*count) pixels
			//          count is the name of the variable you created earlier

			// TURN.    Turn the robot (360/7) degrees to the right

			// COUNT.   Increase the count of how many lines have been drawn so far ( count+=1 )

			// Change the robot pen width to the current value of the count variable 


		//  End the while loop here

		
		// Run the program. 
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
