package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	
	

int a = JOptionPane.showOptionDialog(null, "You are in school and you are walking to class as you enter your math class the teacher says hi,what do you say?", "question 1", 0,
		JOptionPane.INFORMATION_MESSAGE, null, 	new String[] { "hello", "I forgot to study for the exam "}, null);
if (a == 0) {
	JOptionPane.showMessageDialog(null, "Teacher: Great here is the test. This is the question, In a coordinate plane a figure can be reflected by a line other than the x- or y - axis.\n" + 
			"Identify the linear equation for the reflection of Object E and E'? ");
}
if (a == 1) {
	JOptionPane.showMessageDialog(null, "Teacher: WHAT THE.... YOU DIDN'T STUDY! good luck " +
			"Identify the linear equation for the reflection of Object E and B'? ");
}
	 JOptionPane.showOptionDialog(null, "What do you want to tell the teacher?", "question 1", 0,
			JOptionPane.INFORMATION_MESSAGE, null, 	new String[] { "THIS IS TOO HARD", "This is unfair I am reporting you to the school for child abuse"}, null);
}
JOptionPane.showMessageDialog(null, "no u I am out boi");
}

