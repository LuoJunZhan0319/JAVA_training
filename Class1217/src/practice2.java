import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("叫块きタ俱计");
		// ぃ
//		String[] array = new String[5];
//		String S = in.nextLine();
//		
//		
//		char[] array2 = new char[5];
//		
//		for(int i=0; i<array.length; i++)
//			array2[i] = S.charAt(i);
//		
//		System.out.print("叫块稱琩高竚タ俱计");
//		String D = in.nextLine();
//		char d = D.charAt(0);
//		
//		for(int j = 4; j>=0; j--)
//		{
//			if (d == array2[j])
//			{
//				System.out.print(d + "程Ω瞷 ["  + j +  "]" );
//				break;
//			}
//		}

		// 虏(块璶)
//		int[] array = new int[5];
//		for(int i = 0; i<array.length; i++)
//			array[i] = in.nextInt();
//		
//		
//		System.out.print("叫块稱琩高竚タ俱计");
//		int n = in.nextInt();
//		
//		for(int j = 4; j>=0; j--)
//			{
//				if (n == array[j])
//				{
//					System.out.print(n + "程Ω瞷 ["  + j +  "]" );
//					break;
//				}
//			}

		// 硂肈posи痷ぃ穦０
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++)
			array[i] = in.nextInt();

		System.out.print("叫块稱琩高竚タ俱计");
		int query = in.nextInt();

		int count = 0; // 琩高计瞷Ω计
		int pos = -1; // 程Ω计瞷竚 //砞-1琌策篋弧-->单单硂狥﹁碞璶砆и滦籠奔

		for (int i = 0; i < array.length; i++) {
			if (array[i] == query) {
				count++;
				pos = i;
			}

		}

		if (count > 1)
			System.out.println(query + "程Ω瞷 [" + pos + "]");
		else
			System.out.println(query + "瞷 [" + pos + "]");

	}

}
