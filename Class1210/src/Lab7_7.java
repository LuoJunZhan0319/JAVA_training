public class Lab7_7 {
	public static void main(String[] args) {
		int[] score = { 7, 8, 9, 10, 11 };

		int index = 1;
		System.out.println(score[index]);
		System.out.println(++score[index]); // ++�@�Ω�score[index]�A�B�@�ήɶ�����println
		System.out.println(score[index]);

		index = 4;
		System.out.println(score[index]);
		System.out.println(score[index]++); // ++�@�Ω�score[index]�A�B�@�ήɶ��ߩ�println
		System.out.println(score[index]);
	}
}