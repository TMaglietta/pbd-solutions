import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Counting to: ");
        int maxVal = in.nextInt();
        
        for(int i = 0; i <= maxVal; i ++){
            System.out.print(i + " ");
        }
        System.out.println("\nMr.Gallo is cool");
    }
}
