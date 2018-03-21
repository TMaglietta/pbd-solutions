import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type in a message");
        System.out.print("Message: ");
        String message = in.nextLine();
        System.out.print("how many times do you want to see the message?");
        int runCount = in.nextInt();

        int n = 0;
        while (n < runCount) {
            System.out.println(((n+1)*10) + ". " + message);
            n++;
        }
    }
}
/*
    1. n++ increases n by one. getting rid of it makes the loop infinite since n won't increases
    2. change n < 5 to n < 10 to make the loop rin 10 times
*/
