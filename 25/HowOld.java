import java.util.Scanner;

public class HowOld {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		if (age >= 25) {
			System.out.println("You can pretty much do anything");
		} else if (age >= 18) {
			System.out.println("You can void but can't rent a car");
		} else if (age >= 16){
			System.out.println("You can drive but not vote");
		} else {
			System.out.println("You can't drive");
		}
	}
}