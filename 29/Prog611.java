import javax.swing.*;
public class Prog611 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("How Old are you?"));
		System.out.print("Hello, " + name + ". ");
		System.out.println("Next year, you'll be " + (age + 1));
		
		System.exit(0);
	}
}