import java.util.*;

class Main {
    public static void main(String[] args) {
        Random r = new Random();
        
        int playerDraw1 = 1 + r.nextInt(10);
        int playerDraw2 = 1 + r.nextInt(10);
        int playerTotal = playerDraw1 + playerDraw2;
        int dealerDraw1 = 1 + r.nextInt(10);
        int dealerDraw2 = 1 + r.nextInt(10);
        int dealerTotal = dealerDraw1 + dealerDraw2;
        
        System.out.println("You drew:" + playerDraw1 + " and " + playerDraw2);
        System.out.println("Your total is: " + playerTotal);
        System.out.println("\nYou drew:" + playerDraw1 + " and " + playerDraw2);
        System.out.println("Your total is: " + playerTotal);
        
        if(playerTotal < dealerTotal){
            System.out.println("YOU DIED");
        }else if(playerTotal > dealerTotal){
            System.out.println("YOU WIN");
        }else{
            System.out.println("DRAW");
        }
    }
}
