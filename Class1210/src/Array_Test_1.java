import java.util.Scanner;

public class Array_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[] array;// �ŧi�}�C�ܼ�
		array = new int[3]; // ���ͯS�w�}�C�öǻ���}���}�C�ܼ� [�Ʀr] ��ܧA�Q�}���ƦC�Ŷ��h�j
		System.out.println("�}�C������:" + array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println("�п�J��m" + i + "�����");
			array[i] = in.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.print(sum);

//		System.out.println(array[0]);
//		
//		double[] array2 = new double[10]; //�ŧi�H�β��ͯS�w�}�C�öǻ���}���}�C�ܼ�   
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
