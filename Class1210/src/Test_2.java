import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		for (int i = 1; i <= 8; i++) {
			System.out.print(i + ":");
			for (int j = 1; j <= 8; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
