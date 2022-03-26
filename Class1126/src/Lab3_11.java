public class Lab3_11 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello"; // s1's2都指向相同的物件位置
		String s3 = new String("hello"); // 這樣寫不算常值，所以不會在預備的時候就先產生好物件，要等到正式執行程式，新產生hello物件字串
		String s4 = new String("hello"); // 這樣寫不算常值，所以不會在預備的時候就先產生好物件，要等到正式執行程式，新產生hello物件字串
		// 也就是說在最後會在物件區產生3個hello!!!，s1's2導向同一個，s3,s4各自一個!!

		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println("s3=" + s3);
		System.out.println("s4=" + s4);

		if (s1 == s2)
			System.out.println("s1=s2");
		else
			System.out.println("s1 s2 different");

		if (s3 == s4)
			System.out.println("s3=s4");
		else
			System.out.println("s3 s4 different");

	}
}