package _10_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {

		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		int a = JOptionPane.showOptionDialog(null, "What kind of pet do you want", "question 1", 0,
				JOptionPane.INFORMATION_MESSAGE, null, 	new String[] { "Golden retriever", "White poodle", "Indian squater" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	
			for (int i = 0; i < 21; i++) {
				
					
				int task = JOptionPane.showOptionDialog(null, "What do you want to do to your puppy?", "Question 2", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "food", "groom", "clean","slap" }, null);
				if (task == 0) {
					food();
				}
				if (task == 1) {
					groom();
				}
				if (task == 2) {
					clean();
				}
				if (task == 3) {
					slap();
				}
				JOptionPane.showMessageDialog(null,"happiness Level is " + happinessLevel);
				if (happinessLevel >=3)  {
					JOptionPane.showMessageDialog(null, "The puppy likes your treatment, he is now tamed!"); 
					break;
				 }
				 
				 }
			}
		
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		

		// 5. Use user input to call the appropriate method created in step 4.
		

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		 
	

	public static void food() {
		JOptionPane.showMessageDialog(null, "The puppy likes the vegan food, he hasn't ate for the past 2 days!");
		happinessLevel++;
	}

	public static void groom() {
		JOptionPane.showMessageDialog(null, "The puppy is happy cleaning its infecting skin");
		happinessLevel++;
	}

	public static void clean() {
		JOptionPane.showMessageDialog(null, "The puppy is thankfull for getting rid of its parasite infection");
		happinessLevel++;
	}
	public static void slap() {
		JOptionPane.showMessageDialog(null, "The puppy is used to the beatings");
		happinessLevel--;
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

}