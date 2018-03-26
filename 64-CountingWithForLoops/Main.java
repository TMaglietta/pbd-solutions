import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = in.nextLine();
        
        for(int i = 2; i <= 10; i+=2){
            System.out.println(i + ". " + message);
        }
    }
}
/*
    1.  i += 1 increases i by 1 after each iteration 
*/
