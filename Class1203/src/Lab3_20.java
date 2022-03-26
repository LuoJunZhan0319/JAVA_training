public class Lab3_20 {
	public static void main(String[] args) {
		double a = 3.0, b = 4.0, c = 5.0, d = 6.0;
		int e = 10;

		System.out.printf("a = %f\n", a); // printf(前面是格式字串,放置參數)
		System.out.printf("a = %f;b = %f\n", a, b); // 前面格式字串有幾個%，後面就要有幾個參數!!!
		System.out.printf("a = %f;b = %f;c = %f\n", a, b, c);
		System.out.printf("a = %f;b = %f;c = %f;d = %f\n", a, b, c, d);

		System.out.printf("a = %f\n", e); // 會錯，它雖然是右大左小在等號時可以強制轉換型態，但在格式字串前面格式就是覺得絕對的，右邊都要自己主動地去配合它!!
		// 頂多你可以這樣寫~
		System.out.printf("a = %f\n", (double) e);
		// 或是直接把格式改掉
		System.out.printf("a = %d\n", e);
	}
}