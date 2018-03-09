import java.util.Scanner;

public class TwoQuestions {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("TWO QUESTIONS! \nThink of an object, and i'll try to guess it.\n");
		
		System.out.println("Q1) Is it an animal, vegitable or mineral?");
		String answerA = in.next();
		
		System.out.println("Q2) is it bigg?");
		String answerB = in.next();
		
		if(answerA == "animal" && answerB == "no"){
			System.out.println("I guess it's a mouse but i don't actually care");
		}else if(answerA.equals("animal") && answerB.equals("yes")){
			System.out.println("I guess it's a moose but i don't actually care");
		}else if(answerA.equals("vegitable") && answerB.equals("no")){
			System.out.println("I guess it's a carrot but i don't actually care");
		}else if(answerA.equals("vegitable")  && answerB.equals("yes")){
			System.out.println("I guess it's a watermelon but i don't actually care");
		}else if(answerA.equals("mineral") && answerB.equals("no")){
			System.out.println("I guess it's a paperclip but i don't actually care");
		}else if(answerA.equals("mineral") && answerB.equals("yes")){
			System.out.println("I guess it's a Camaro but i don't actually care");
		}else{
			System.out.println("Don't mess with me");
		}
		
		System.out.println(answerA);
		System.out.println(answerB);
	}
}