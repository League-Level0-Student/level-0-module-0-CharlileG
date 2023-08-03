package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		
		int score = 0;
		
		
		
		
		String input = JOptionPane.showInputDialog("What year was the first computer invented?"); 
		
		
		if (input.equals("1822") || input.equals("1991")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
		score += 1;
		}
		
		if (!input.equals("1822") && !input.equals("1991")) {
			
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		JOptionPane.showMessageDialog(null, "Your score is" + score );
		
		String inputt = JOptionPane.showInputDialog("True or False, Sharks can smell a single drop of blood from a mile away?"); 
		
		
		
		if (inputt.equals("false")) { 
			
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		
		
			if (inputt.equals("true")) {
				
				JOptionPane.showMessageDialog(null, "Incorrect");
				
			}
		
			JOptionPane.showMessageDialog(null, "Your score is" + score );
		String inputtt = JOptionPane.showInputDialog("true or false, 2+2=4"); 
		
		
		if (inputtt.equals("true")) {
			
			JOptionPane.showMessageDialog(null, "Correct");	
			score += 1;
		}
		
		
			if (inputtt.equals("false")) {
				
				JOptionPane.showMessageDialog(null, "Incorrect");
				
			}
		
		
			JOptionPane.showMessageDialog(null, "Your score is" + score );
		String inputttt = JOptionPane.showInputDialog("true or false, 1+1=3 (I know this question is very challenging so take your time on it okay?)"); 
		
		
		
		if (inputttt.equals("false")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		
		
			if (inputttt.equals("true")) {
				
				JOptionPane.showMessageDialog(null, "Incorrect");
				
			}
		
		
			JOptionPane.showMessageDialog(null, "Your score is" + score );
		
			JOptionPane.showMessageDialog(null, "You have compleeted my Quiz, Good Job...");
		
		
		
		
		
		
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
