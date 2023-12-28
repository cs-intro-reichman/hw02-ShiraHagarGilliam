/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int randomNum1 = (int)(Math.random() * 10);
		int randomNum2;
		do {
			System.out.print(randomNum1 + " ");
			randomNum2 = randomNum1;
			randomNum1 = (int)(Math.random() * 10);
		}
		while (randomNum1 >= randomNum2);
	}
}