import java.util.Scanner;
public class Adventure {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("WELLCOME TO THE TRIALS\nPlease input the words in quotations to make the corresponding choice");
		System.out.println("\nYou walk into the main hall of a creepy castle.\nwill 'light' a candle or try to look around in the 'dark'");
		String choice = in.next();
		
		if(choice.equals("light")){
			System.out.println("You light your candle only to see a suit of armour charging at you. What will you do?\n'run' away or 'fight' the armour");
			choice = in.next();
				if(choice.equals("run")){
					System.out.println("You barely escaped with your life.");
				}else if(choice.equals("fight")){
					System.out.println("The armour draws a sword and proceeds to cleave you in half. You should've brought a weapon too.");
					System.out.println("YOU DIED");
				}else{
					System.out.println("INVALID ANSWER. YOU FAILED");
				}
		}else if(choice.equals("dark")){
			System.out.println("You manage to stumble into a lit stairwell what do you do?\ngo 'up' or go 'down'?");
			choice = in.next();
				if(choice.equals("up")){
					System.out.println("The staircase crumbled under your weight. Maybe you shouldn't wear heavy armour treasure hunting");
					System.out.println("YOU DIED");
				}else if(choice.equals("down")){
					System.out.println("Nice! you found a vault full of treasure and decide to take as much loot as you can before leaving");
				}else{
					System.out.println("INVALID ANSWER. YOU FAILED");
				}
		}else{
			System.out.println("INVALID ANSWER. YOU FAILED");
		}
		
	}
}