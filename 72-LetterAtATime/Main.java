import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		
		System.out.println("\nHere are all the characters, one at a time:\n");
		for (int i = 0; i < message.length(); i++) {
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int aCount = 0;

		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			if (letter == 'a' || letter == 'A'||letter == 'e' || letter == 'E'||letter == 'i' || letter == 'I'||letter == 'o' || letter == 'O'||letter == 'u' || letter == 'U') {
				aCount++;
			}
		}

		System.out.println("\nYour message contains uses vowels ' " + aCount + " times. Isn't that interesting?");

	}
}
/*
   1. by using <= in the for loop you get an error 
   2. if the value is box its length is 2 and the x is at 2
   3. it ends up passing the final character in the string and checking nothing for a string value.
*/
