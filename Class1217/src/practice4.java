import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("�n����X�Ӥ��");
		int num = in.nextInt();

		int[] array = new int[2]; // ���骺�}�C
		int sum = 0; // �`�Ѽƪ��ܼ�
		for (int i = 0; i < num; i++) {
			System.out.println("�п�J��  ��");
			for (int j = 0; j <= 1; j++)
				array[j] = in.nextInt();
			for (int j = 1; j <= array[0]; j++) {
				switch (j) {
				case 2:
				case 4:
				case 6:
				case 8:
				case 9:
					case11: sum += 31;
					break;
				case 3:
					sum += 29;
					break;
				case 5:
				case 7:
				case 10:
				case 12:
					sum += 30;
					break;
				}

			}
			sum += array[1] - 1;
			int day = sum % 7;
			// System.out.println(sum);

			switch (day) {
			case 0:
				System.out.println("�P��3");
				break;
			case 1:
				System.out.println("�P��4");
				break;
			case 2:
				System.out.println("�P��5");
				break;
			case 3:
				System.out.println("�P��6");
				break;
			case 4:
				System.out.println("�P��7");
				break;
			case 5:
				System.out.println("�P��1");
				break;
			case 6:
				System.out.println("�P��2");
				break;
			}

		}

	}

}
