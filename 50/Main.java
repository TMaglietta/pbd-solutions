import java.util.Random;

class Main {
    public static void main(String[] args) {
            Random rng = new Random();
            
            System.out.println("Let's roll some dice..");
            
            int dieA = 1 + rng.nextInt(20);
            int dieB = 1 + rng.nextInt(20);
            
            while(dieA != dieB){
                
                System.out.println(dieA + " and " + dieB + " and the total is " + (dieA + dieB) + " roll again...");
                
                dieA = 1 + rng.nextInt(6);
                dieB = 1 + rng.nextInt(6);
            }
            System.out.println(dieA + " and "+ dieB + " Doubles! With a total of " + + (dieA + dieB));
            
        }
    }
