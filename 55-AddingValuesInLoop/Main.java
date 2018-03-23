import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Give me some numbers to add. To stop adding input 0");
    System.out.print("Number: ");
    int val = in.nextInt();
    int total = val;
    
    int i = 0;
    while (val != 0){
        System.out.println("\nYour current total is: " + total);
        System.out.print("Number: ");
        val = in.nextInt();
        total += val;
    }
   System.out.println("the final total is: " + total);
  }
}
