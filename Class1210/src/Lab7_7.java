public class Lab7_7 {
	public static void main(String[] args) {
		int[] score = { 7, 8, 9, 10, 11 };

		int index = 1;
		System.out.println(score[index]);
		System.out.println(++score[index]); // ++作用於score[index]，且作用時間早於println
		System.out.println(score[index]);

		index = 4;
		System.out.println(score[index]);
		System.out.println(score[index]++); // ++作用於score[index]，且作用時間晚於println
		System.out.println(score[index]);
	}
}