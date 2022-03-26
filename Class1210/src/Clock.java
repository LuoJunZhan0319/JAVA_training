
/**
   This program uses nested loops to simulate a clock.
*/
import java.util.Scanner;

public class Clock {
	public static void main(String[] args) {

		int Count1 = 0, Count2 = 0, Count3 = 0;
		Scanner keyboard = new Scanner(System.in);

		// Simulate the clock.
		for (int hours = 1; hours <= 12; hours++) {
			// Count1++;
			for (int minutes = 0; minutes <= 59; minutes++) {
				// Count2++;
				for (int seconds = 0; seconds <= 59; seconds++) {
					// Count3++;
					System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
					// keyboard.nextLine();
				}
			}
		}

		// System.out.println(Count1);
		// System.out.println(Count2);
		// System.out.println(Count3);
	}
}