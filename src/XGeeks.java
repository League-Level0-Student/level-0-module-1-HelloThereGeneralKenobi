//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String emanuele = ("Emanuele");
		String lukas  = "Lukas";
		String jesus = "Jesus";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane.showInputDialog("What's your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
		if(answer.equalsIgnoreCase(emanuele)) {
			JOptionPane.showMessageDialog(null, emanuele + "'s power is being better than everybody else.");
		}
		if(answer.equalsIgnoreCase(lukas)) {
			JOptionPane.showMessageDialog(null, lukas + "'s power is coming up with bad superpowers.");
		}
		if(answer.equalsIgnoreCase(jesus)) {
			JOptionPane.showMessageDialog(null, jesus + "'s power is bamboozling everybody.");
		}
	}
}

