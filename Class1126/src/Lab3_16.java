import java.util.Random;

public class Lab3_16 {
	public static void main(String[] args) {
		Random randomNumber = new Random();

		for (int i = 0; i < 1000; i++) {
			int temp = randomNumber.nextInt(100);
			System.out.println(temp);
		}
	}
}