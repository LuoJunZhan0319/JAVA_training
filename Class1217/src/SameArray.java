/**
 * This program demonstrates that two variables can reference the same array.
 */
//超級重要的題目

public class SameArray {
	public static void main(String[] args) {
		int[] array1 = { 2, 4, 6, 8, 10 };
		int[] array2 = array1; // 當兩個參考變數都指向同一個陣列時，對兩個參考變數內容作修改，其實都是對同一個陣列物件做改變

		// Change one of the elements using array1.
		array1[0] = 200;

		// Change one of the elements using array2.
		array2[4] = 1000;

		// Display all the elements using array1
		System.out.println("The contents of array1:");
		for (int value : array1)
			System.out.print(value + " ");
		System.out.println();

		// Display all the elements using array2
		System.out.println("The contents of array2:");
		for (int value : array2)
			System.out.print(value + " ");
		System.out.println();
		
	}
}