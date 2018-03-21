import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int rng = r.nextInt(10);
        System.out.println("Guess a number from 0-10 and i'll tell you if it's right");
        
        int guess = in.nextInt();
        int numTries = 1;
        while(guess != rng){
            System.out.println("Wrong guess again");
            guess = in.nextInt();
            numTries++;
        }
         System.out.println("it took you " + numTries + " tries");
     }
}
