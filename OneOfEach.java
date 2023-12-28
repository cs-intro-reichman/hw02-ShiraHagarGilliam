
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		double randomChance = Math.random();
		int childrenCount = 0;
		boolean girl = false;
		boolean boy = false;
		
		do {
			if(randomChance < 0.5) {
				girl = true;
				System.out.print("g ");
			} else {
				boy = true;
				System.out.print("b ");
		    }
			randomChance = Math.random();
			childrenCount = childrenCount + 1;
		}
		while(!(girl && boy));
		
		System.out.println("");
		System.out.print("You made it... and you now have " + childrenCount + " children.");
	}
}