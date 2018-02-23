import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give me a word ");
        input.next();
        
        System.out.print("Give me another word ");
        input.next();

        System.out.print("Give me a Number ");
        input.next();

        System.out.print("Give me one more number ");
        input.next();

        System.out.println("Cool");
    }
}
