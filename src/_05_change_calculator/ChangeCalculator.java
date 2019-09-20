package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
				String r=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
				int i =Integer.parseInt(r);
		// Ask the user how many dimes they have, and convert their answer
				String c=JOptionPane.showInputDialog("How many dimes do you have?");
				int z =Integer.parseInt(c);
		// Ask the user how many quarters they have, and convert their answer
				String a=JOptionPane.showInputDialog("How many quarters do you have?");
				int s =Integer.parseInt(a);
				
		// Calculate how much money the user has and save it in a double variable 
			double j= (i*0.05)+(s*0.25)+(z*0.10);
		// Tell the user how much money t
			JOptionPane.showMessageDialog(null, "$"+j);
			System.out.println(j);
			
	}
}

