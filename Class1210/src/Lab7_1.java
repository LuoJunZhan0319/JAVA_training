public class Lab7_1 {
	public static void main(String[] args) {
		// array size cannot be negative
		// but this is a runtime error

		int[] intArray1 = new int[-1]; // 不會發生編譯上的錯誤，但會有執行的錯誤
		int[] intArray2 = new int[0];

		// 陣列基礎型態可為任意型態...

		String[] names = new String[5];
	}
}
