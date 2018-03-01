import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your weight");
		int weight = in.nextInt();
		
		System.out.println("I have info for the following planets:");
		System.out.println("\t 1.Venus \t 2.Mars \t 3.Jupiter");
		System.out.println("\t 4.Saturn \t 5.Uranus \t 6.Neptune");
		
		System.out.println("Which planet are you visiting?");
		int planet = in.nextInt();
		
		if (planet == 1) {
			System.out.println("You will weigh " + weight * 0.78 + " on Venus");
		} else if (planet == 2) {
			System.out.println("You will weigh " + weight * 0.39 + " on Mars");
		} else if (planet == 3) {
			System.out.println("You will weigh " + weight * 2.65 + " on Jupiter");
		} else if (planet == 4) {
			System.out.println("You will weigh " + weight * 1.17 + " on Saturn");
		} else if (planet == 5) {
			System.out.println("You will weigh " + weight * 1.05 + " on Uranus");
		} else if (planet == 6) {
			System.out.println("You will weigh " + weight * 1.23 + " on Neptune");
		} else {
			System.out.println("This planet is not in my system");
		}
	}
}