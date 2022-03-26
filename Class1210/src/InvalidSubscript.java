/**
 * This program uses an invalid subscript with an array.
 */

public class InvalidSubscript {
	public static void main(String[] args) {
		int[] values = new int[3];

		System.out.println("I will attempt to store four " + "numbers in a three-element array.");

		for (int index = 0; index < 4; index++) {
			System.out.println("Now processing element " + index);
			values[index] = 10; // 到value[3]就會超出array的邊界，故會拋出錯誤訊息。 -->off by one error
			// 所以一般用value.length是最安全的選擇喲!!
		}
	}
}
