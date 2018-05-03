import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog(null, "How did the tree get on the internet?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle.equalsIgnoreCase("He logged on")) {
			JOptionPane.showMessageDialog(null, "Score + 1");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		
		String riddle1 = JOptionPane.showInputDialog(null, "What has 4 legs in the morning, 2 in the afternoon, and 3 at night?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle1.equalsIgnoreCase("A human")) {
			JOptionPane.showMessageDialog(null, "Score + 1");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

