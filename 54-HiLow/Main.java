import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        
        int rng = 1 + r.nextInt(100);
        int guess = 0;
        
        System.out.println("Guess a number from 1-100 in 7 tries.");
        
        int i = 0;
        while(i < 7&&guess != rng){
            i++;
            System.out.println("Guess #" + i + ": ");
            guess = in.nextInt();
            if(guess < rng){
                System.out.println("Sorry too low");
            }else if (guess > rng){
                System.out.println("Sorry too high");
            }else{
                System.out.println("Correct!");
            }
        }
        if(guess != rng){
            System.out .println("You lose");
        }
    }
}
