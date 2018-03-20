import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME TO THE BANK");
        System.out.print("ENTER YOUR PIN: ");
        int entry = in.nextInt();
        
        while(entry != pin){
            System.out.println("\n ACCESS DENIED INCORRECT PIN");
            System.out.print(" ENTER PIN: ");
            entry = in.nextInt();
        }
    
        System.out.println("\n ACCESS GRANTED");
    }
}
/*
    1.Like if statements, while loops check a condition before running
    2.While loops repeat themselves until the condition is no longer true
    3.There is no 'int' in the loop since the line modifies a preexisting variable
    4.Removing the line causes the loop to repeat infinitely
*/
