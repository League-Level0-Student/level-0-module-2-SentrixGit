//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		Random randy = new Random();
		System.out.println(randy);
		int randomVaribles = 3; //randy.nextInt(4);
		
		String inputString = JOptionPane.showInputDialog("What is your question?"); 
		if (randomVaribles == 0) 
		{
			System.out.println("Yes!");
		}
		else if (randomVaribles == 1) 
		{
			System.out.println("No");
		}
		else if (randomVaribles == 2) 
		{
			System.out.println("Ask google");
		}
		else if (randomVaribles == 3) 
		{
			System.out.println("Press alt + f4 if you are on windows and command + q on mac");
		}
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
