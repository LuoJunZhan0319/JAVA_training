/**
 * This program displays numbers padded with leading zeros.
 */

public class LeadingZeros {
	public static void main(String[] args) {
		// Declare a variety of double variables.
		double number1 = 1.234;
		double number2 = 12.345;
		double number3 = 123.456;

		// Display each variable with leading
		// zeros, in a field of 9 spaces, rounded
		// to 2 decimal places.
		System.out.printf("%09.2f\n", number1); // 前導0表示，未滿欄寬的部分，都用0補齊!!
		System.out.printf("%09.2f\n", number2);
		System.out.printf("%09.2f\n", number3);
	}
}