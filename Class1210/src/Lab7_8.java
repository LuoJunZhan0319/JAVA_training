public class Lab7_8 {
	public static void main(String[] args) {
		int[] score = { 70, 80, 90, 100, 10 };

		int index = 1;
		System.out.println(score[index]);
		System.out.println(score[++index]); // ++�@�Ω�index�A�B�@�ήɶ�����[]�Pprintln
		System.out.println(score[index]);

		index = 4;
		System.out.println(score[index]);
		System.out.println(score[index++]); // ++�@�Ω�index�A�B�@�ήɶ��ߩ�[]�Pprintln
		System.out.println(score[index]);
	}
}