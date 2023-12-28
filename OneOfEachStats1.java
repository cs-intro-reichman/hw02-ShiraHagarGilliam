/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		int randomChance = (int)(Math.random() * 2);
		int anotherRandomChance = 0;
		int childrenCount = 0;
		double finalChildrenNum = 0;
		
		int twoChildren = 0;
		int threeChildren = 0;
		int fourChildren = 0;
		
		for(int i = 0; i < T; i++) {
		do {
			childrenCount = childrenCount + 1;
			anotherRandomChance = (int)(Math.random() * 2);
		}
		while(anotherRandomChance == randomChance);
		
		childrenCount = childrenCount + 1;
		if(childrenCount == 2) {
			twoChildren = twoChildren + 1;
		} else if(childrenCount == 3) {
			threeChildren = threeChildren + 1;
		} else if(childrenCount >= 4) {
			fourChildren = fourChildren + 1;
		}
		finalChildrenNum = finalChildrenNum + childrenCount;
		childrenCount = 0;
		}
		double avergeChildrenNum = finalChildrenNum / T;
		System.out.println("Average: " + avergeChildrenNum + " children to get at least one of each gender.");
	    System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourChildren);
		
		if(twoChildren >= threeChildren) {
			if(twoChildren >= fourChildren) {
				System.out.println("The most common number of children is 2.");
			} else {
				System.out.println("The most common number of children is 4 or more.");
			}
		} else {
			if(threeChildren >= fourChildren) {
				System.out.println("The most common number of children is 3.");
			} else {
				System.out.println("The most common number of children is 4 or more.");
			}
		}
	}
}