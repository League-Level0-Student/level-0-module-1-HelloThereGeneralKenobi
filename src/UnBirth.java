import javax.swing.JOptionPane;

public class UnBirth {
	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog("What's your borthday?");
		if(date.equals("05/02/2018"))
				{
					JOptionPane.showMessageDialog(null, "Happy Borth");
				}
		else 
		{
			JOptionPane.showMessageDialog(null, "Happy UnBorth");
		}
	}
}
