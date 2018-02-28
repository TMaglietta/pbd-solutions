import java.util.Scanner;

public class InputData {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("The NSA wants to know");
		
		System.out.print("First name: ");
		String firstName = input.next();
		
		System.out.print("Last name: ");
		String lastName = input.next();
		
		System.out.print("Grade (9-12):");
		int grade = input.nextInt();
		
		System.out.print("Student number: ");
		int studentNum = input.nextInt();
		
		System.out.print("Login: ");
		String login = input.next();
		
		System.out.print("Average: ");
		double average = input.nextDouble();
		
		System.out.println("Info our \"Not Spies\" collected:");
		System.out.println("\t Login: " + login);
		System.out.println("\t ID: " + studentNum);
		System.out.println("\t Name " + lastName + ", " + firstName);
		System.out.println("\t Avg: " + average);
		System.out.println("\t Grade: " + grade);
	}
}