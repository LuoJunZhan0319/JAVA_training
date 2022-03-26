import java.util.Arrays;
import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 5, 3, 7, 9, 10, 0 };
		int[] array2 = Arrays.copyOf(array1, 7);

		Scanner in = new Scanner(System.in);

		System.out.println("請輸入正整數n: ");
		int n = in.nextInt();

		System.out.println("請輸入正整數k: ");
		int k = in.nextInt();

		if (k < 6) {
			for (int i = 5; i >= k; i--) {
				array2[i + 1] = array2[i];
			}
			array2[k] = n;
		} else {
			array2[6] = n;
		}

		for (int i : array2) {
			System.out.print(i + " ");
		}

	}

}
