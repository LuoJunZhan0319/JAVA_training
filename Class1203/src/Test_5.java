import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String star = "*";

		System.out.print("��J�P�P���");
		int row = in.nextInt();

		System.out.print("��J�P�P�C��");
		int column = in.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
