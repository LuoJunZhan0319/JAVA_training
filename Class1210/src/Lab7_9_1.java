import java.util.Arrays;

public class Lab7_9_1 {
	public static void main(String[] args) {
		int[] array1 = { 2, 4, 6, 8, 10 };
		int[] array2 = { 10, 20, 30, 40, 50 };
		int index = 0;

		// �ϥμW�j�� for �j��ާ@ array1
		// �P�ɨϥ��ܼ� index �ާ@ array2

		for (int temp : array1) {
			System.out.println(index + ": " + (temp + array2[index]));
			index++;
		}
		int[] array3 = Arrays.copyOf(array1,array1.length);
		System.out.println(Arrays.equals(array1, array2));

		
	}
}