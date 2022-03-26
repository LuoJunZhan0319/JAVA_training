import java.util.Random;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 0, 1, 2, 3 };
		int ran_num1 = 0;
		int ran_num2 = 0;
		int ran_num3 = 0;
		int ran_num4 = 0;

		for (int i = 0; i < 100; i++) {
			Random ran = new Random();
			ran_num1 = ran.nextInt(4);

			System.out.print(ran_num1 + " ");

			do
				ran_num2 = ran.nextInt(4);
			while (ran_num1 == ran_num2);

			System.out.print(ran_num2 + " ");

			do
				ran_num3 = ran.nextInt(4);
			while (ran_num3 == ran_num1 || ran_num3 == ran_num2);

			System.out.print(ran_num3 + " ");

			do
				ran_num4 = ran.nextInt(4);
			while (ran_num4 == ran_num1 || ran_num4 == ran_num2 || ran_num4 == ran_num3);

			System.out.print(ran_num4 + " ");

			System.out.println();

		}
	}

}
