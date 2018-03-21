import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxTries = 5;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = in.nextInt();
        tries++;

        while (entry != pin && tries < maxTries) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = in.nextInt();
            tries++;
        }

        if (entry == pin)
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if (tries >= maxTries)
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. TIME TO CALL THE POLICE.");
    }
}
