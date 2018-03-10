import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Your height in m: ");
		float height = in.nextFloat();
		
		System.out.print("Your Weight in kg: ");
		float weight = in.nextFloat();
		
		float bmi = weight / (height*height);
		
		System.out.println("Your BMI is " + bmi);
		
		//float bmi = in.nextFloat();
		
		if(bmi < 15){
			System.out.println("You are very severely underweight");
		}else if(bmi >= 15 && bmi <= 16){
			System.out.println("You are severely underweight");
		}else if(bmi > 16 && bmi < 18.5){
			System.out.println("You are underweight");
		}else if(bmi >= 18.5 && bmi < 25){
			System.out.println("You are at a healthy weight");
		}else if(bmi >= 25 && bmi < 30){
			System.out.println("You are overweight");
		}else if(bmi >= 30 && bmi < 35){
			System.out.println("You are moderately obese");
		}else if(bmi >= 35 && bmi < 40){
			System.out.println("You are severely obese");
		}else{
			System.out.println("You are morbidly obese");
		}
	}
}