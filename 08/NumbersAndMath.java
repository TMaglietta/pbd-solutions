public class NumbersAndMath {
	
	public static void main(String[] args) {
		System.out.println("I will now count my chickens:");

		System.out.println("Hens " + (25 + 30 / 6)); //math 25 + 30/6
		System.out.println("Roosters " + (100 - 25 * 3 % 4)); //math 100 -25 * 3 % 4 (% is modulus)

		System.out.println("Now I will count the eggs:");

		System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6); //math 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6

		System.out.println("Is it true that 3 + 2 < 5 - 7?");

		System.out.println(3 + 2 < 5 - 7); //print false

		System.out.println("What is 3 + 2? " + (3 + 2)); //math 3 + 2
		System.out.println("What is 5 - 7? " + (5 - 7)); //math 5-7

		System.out.println("Oh, that's why it's false.");

		System.out.println("How about some more.");

		System.out.println("Is it greater? " + (5 > -2)); //print truer
		System.out.println("Is it greater or equal? " + (5 >= -2)); //print true
		System.out.println("Is it less or equal? " + (5 <= -2)); //print false
	}
}