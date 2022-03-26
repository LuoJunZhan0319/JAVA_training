import java.util.Scanner;

/**
 * This program demonstrates a nested loop.
 */

public class TestAverage2 {
	public static void main(String[] args) {
		int numStudents, // Number of students
				numTests, // Number of tests per student
				score, // Test score
				total; // Accumulator for test scores
		double average; // Average test score

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of students.
		System.out.print("How many students do you have? ");
		numStudents = keyboard.nextInt();

		// Get the number of test scores per student.
		System.out.print("How many test scores per student? ");
		numTests = keyboard.nextInt();

		// Process all the students.
		for (int student = 1; student <= numStudents; student++) // 針對每位學生進行處理
		{
			total = 0; // Set the accumulator to zero.

			// Get the test scores for a student.
			System.out.println("Student number " + student);
			System.out.println("--------------------");
			for (int test = 1; test <= numTests; test++) // 針對某位同學進行成績累加
			{
				System.out.print("Enter score " + test + ": ");
				score = keyboard.nextInt();
				total += score; // Add score to total.
			}

			// Calculate and display the average.
			average = total / numTests; // 強制資料轉型
			System.out.printf("The average for student %d is %.1f.\n\n", student, average);
		}
	}
}
