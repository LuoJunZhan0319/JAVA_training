public class Lab7_6 {
	public static void main(String[] args) {
		int[] score = { 7, 8, 9, 10, 11 };

		System.out.println(score[1]);
		System.out.println(++score[1]); // ���i��++�A��i��println
		System.out.println(score[1]);

		System.out.println(score[4]);
		System.out.println(score[4]++); // ���i��println�A��i��++
		System.out.println(score[4]);
	}
}