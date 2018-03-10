import java.util.Scanner;

public class BMICalc {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Your height in m: ");
		float height = in.nextFloat();
		
		System.out.print("Your Weight in kg: ");
		float weight = in.nextFloat();
		
		float bmi = weight / (height*height);
		
		System.out.println("Your BMI is " + bmi);
	}
}