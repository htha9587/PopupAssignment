package input.controller;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output
 * @author htha9587
 *
 */

public class PopupDisplay 
{

	public String getAnswer(String input)
	{
		String answer = "You were meant to know.";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
