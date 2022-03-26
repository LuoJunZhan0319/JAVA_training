public class Lab7_9 {
	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8, 10 };

		int i = 0;
		for (int temp : array) {
			if (i % 2 == 0)
				System.out.println(temp);
			i++;
		}
	}
}