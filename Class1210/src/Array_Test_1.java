import java.util.Scanner;

public class Array_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[] array;// 宣告陣列變數
		array = new int[3]; // 產生特定陣列並傳遞位址給陣列變數 [數字] 表示你想開的數列空間多大
		System.out.println("陣列的長度:" + array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println("請輸入位置" + i + "的整數");
			array[i] = in.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.print(sum);

//		System.out.println(array[0]);
//		
//		double[] array2 = new double[10]; //宣告以及產生特定陣列並傳遞位址給陣列變數   
//		
//		System.out.println(array2[7]);
//		
//		for(int i = 0; i<6; i++)
//		{
//			System.out.println(array[i]);
//		}
//		
//		
//		String[] cities = {"Taipei", "Taichung", "Linkou"};
//		
//		for(int i=0; i<3; i++)
//		{
//			System.out.println(cities[i]);
//		}

	}

}
