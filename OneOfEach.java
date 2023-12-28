
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		int randomChance = (int)(Math.random() * 2);
		int childrenCount = 0;
		int anotherRandomChance = 0;
		do {
			if(randomChance == 0) {
				System.out.print("g ");
			} else {
				System.out.print("b ");
		    }
			anotherRandomChance = (int)(Math.random() * 2);
			childrenCount = childrenCount + 1;
		}
		while(anotherRandomChance == randomChance);
		if(anotherRandomChance == 0) {
			System.out.println("g");
		} else {
			System.out.println("b");
	    }
		childrenCount = childrenCount + 1;
		System.out.print("You made it... and you now have " + childrenCount + " children.");
	}
}