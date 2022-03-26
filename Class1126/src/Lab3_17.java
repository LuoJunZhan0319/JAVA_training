public class Lab3_17 {
	public static void main(String[] args) {
		String s1 = "aa";
		String s2 = "a";
		String s3 = s2 + s2;

		if (s1 == s3) // 比較物件區的物件參考位置是否相同!!!
			System.out.println("They are the same.");
		else {
			System.out.println("They are different");
			System.out.println("s1:" + s1);
			System.out.println("s3:" + s3);
		}
	}
}