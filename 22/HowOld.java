import java.util.Scanner;

public class HowOld {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Name please");
		String name = input.next();
		
		System.out.println("Ok " + name + ", How old are you");
		int age = input.nextInt();
		
		if(age < 16){
			System.out.println("you can't drive, " + name);
		}
		if (age < 18){
			System.out.println("You can't vote, " + name);
		}
		if(age < 25){
			System.out.println("You can't rent a car, " + name);
		}
		if(age > 25){
			System.out.println("You can do anything thats legal, " + name);
		}
	}
}