
public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 56, 29, 12, 19, 33 };

		// (1)
		int k = 0;
		int a = array[k++];
		int b = array[k++];
		int c = array[k++];
		int d = array[k++];
		int e = array[k];
		int f = a + b + c + d + e;
		System.out.println(f);

		// (2)
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		System.out.println(sum);

		// (3)
		int[] array2 = { 56, 29, 12, 3, 19, 33 };
		int sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			sum2 += array2[i];
			if (sum2 > 100) {

				System.out.println("加到第" + i + "個元素時超過100");
				System.out.println("此時總和為= " + sum2);
				break;
			}
		}

	}

}
