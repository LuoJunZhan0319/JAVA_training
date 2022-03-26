import java.util.Scanner;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("請輸入五個正整數");
		// 不加空格版
//		String[] array = new String[5];
//		String S = in.nextLine();
//		
//		
//		char[] array2 = new char[5];
//		
//		for(int i=0; i<array.length; i++)
//			array2[i] = S.charAt(4-i);
//		
//		
//		for(int i : array2)
//			System.out.print((char)i + " ");

		// 簡易版 (輸入時要加空格)
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++)
			array[i] = in.nextInt();

		for (int i = 4; i >= 0; i--)
			System.out.print(array[i] + " ");

	}

}
