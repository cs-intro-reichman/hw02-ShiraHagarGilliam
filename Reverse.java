/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String givenArg = args[0];
		int stringLength = givenArg.length();
		String newString = "";
		for(int i = (stringLength - 1); i >= 0; i--) {
			newString = newString + givenArg.charAt(i);
		}
		System.out.println(newString);
		int halfLength = newString.length() / 2;
		char middleChar = newString.charAt(halfLength);
		System.out.println("The middle character is " + middleChar);
	}
}