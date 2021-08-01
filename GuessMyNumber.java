package GuessMyNumber;

import javax.swing.JOptionPane;

public class GuessMyNumber {

	public static void main(String[] args) {
		String range = JOptionPane.showInputDialog(null, "In this game, you will need to guess the number I'm thinking about!\nEnter the wanted range (the larget number) ", "Guess My Number", 3);
		int userRange;
		userRange = Integer.parseInt(range);
		
		int computerNumber = (int)(Math.random() * userRange + 1); 
		int userNumber = 0;
		int count = 1;
		
		
		while (userNumber != computerNumber) {
			String response = JOptionPane.showInputDialog(null, "Enter your guess ", "Guess My Number", 3);
			userNumber = Integer.parseInt(response);
			 JOptionPane.showMessageDialog(null, ""+ determineGuess(userRange, userNumber, computerNumber, count));
	            count++;
		}

	}

	private static String determineGuess(int range, int userNumber, int computerNumber, int count) {
		if(userNumber < 0 || userNumber > range) {
			return "Invalid guess, try again\n Try number " + count;
		}
		else if (userNumber < computerNumber) {
			return "your number is smaller than mine\n Try number " + count;
		}
		else if(userNumber > computerNumber) {
			return "your number is bigger than mine\n Try number " + count;
		}
		else if(userNumber == computerNumber) {
			return "Correct! number of guesses- " + count;
		}
		else
			return "Invalid input\n Try number " + count;
	}

}
