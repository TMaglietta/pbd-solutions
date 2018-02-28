public class ElseAndIfs{
	public static void main(String[] args){
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if (cars > people) {
            System.out.println("We should take the cars.");
        } if (cars < people) { 
            System.out.println("We should not take the cars.");
        } else { //if the previous condition is not met run this
            System.out.println("We can't decide.");
        }
        
        
        if (buses > cars) {
            System.out.println("That's too many buses.");
        } else if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }
        
        
        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }
    }
}		//else if -> if the previous condition is not met check this
		//else -> if none of the previous conditions were met run this
		
		// removing an else from the else if makes the else run since it will only check ifs and 'linked' else ifs