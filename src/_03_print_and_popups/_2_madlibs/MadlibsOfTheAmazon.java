package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		
		
		
		// Get the player to enter an adjective
 
 String input = JOptionPane.showInputDialog("Give me an adjective"); 
   
 
 String inputt = JOptionPane.showInputDialog("Give me a type of liquid");
 

 String inputtt = JOptionPane.showInputDialog("Give me a body part");  
	  
    
 String inputttt = JOptionPane.showInputDialog("Give me a verb"); 
 

 String inputtttt = JOptionPane.showInputDialog("Give me a place");  
 
		// Get the player to enter a type of liquid

		// Get the player to enter a body part

		// Get the player to enter a verb

		// Get the player to enter a place

		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		JOptionPane.showMessageDialog(null, 
		"Piranhas are more " + input + " during the day, so cross the river at\n"  +
		"night. Piranhas are attracted to fresh " + inputt + " and will most\n"  +
		"likely take a bite out of your " + inputtt + " if you " + inputttt + " . Whatever\n"  +
		"you do, if you have an open wound, try to find another way to get\n"  +
		"back to the " + inputtttt  + " . Good luck!");
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}
}