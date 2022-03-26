public class Lab7_8 {
	public static void main(String[] args) {
		int[] score = { 70, 80, 90, 100, 10 };

		int index = 1;
		System.out.println(score[index]);
		System.out.println(score[++index]); // ++作用於index，且作用時間早於[]與println
		System.out.println(score[index]);

		index = 4;
		System.out.println(score[index]);
		System.out.println(score[index++]); // ++作用於index，且作用時間晚於[]與println
		System.out.println(score[index]);
	}
}