import java.util.Scanner;

public class AgeMsg {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("How Old are you?");
		int age = in.nextInt();
		
		if(age <16)
			System.out.println("you can't drive.");
		if(age >= 16 && age <= 17)
			System.out.println("You can drive but not vote.");
		if(age >=18 && age <= 24)
			System.out.println("You can vote but not rent a car");
		if(age >= 25)
			System.out.println("you can pretty much do anything");
	}
}