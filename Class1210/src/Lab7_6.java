public class Lab7_6 {
	public static void main(String[] args) {
		int[] score = { 7, 8, 9, 10, 11 };

		System.out.println(score[1]);
		System.out.println(++score[1]); // 先進行++，後進行println
		System.out.println(score[1]);

		System.out.println(score[4]);
		System.out.println(score[4]++); // 先進行println，後進行++
		System.out.println(score[4]);
	}
}