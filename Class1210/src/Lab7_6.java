public class Lab7_6 {
	public static void main(String[] args) {
		int[] score = { 7, 8, 9, 10, 11 };

		System.out.println(score[1]);
		System.out.println(++score[1]); // ¥ý¶i¦æ++¡A«á¶i¦æprintln
		System.out.println(score[1]);

		System.out.println(score[4]);
		System.out.println(score[4]++); // ¥ý¶i¦æprintln¡A«á¶i¦æ++
		System.out.println(score[4]);
	}
}