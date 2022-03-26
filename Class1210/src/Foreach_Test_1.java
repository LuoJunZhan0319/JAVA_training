
public class Foreach_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 12, 13, 14, 15, 16, 17, 18 };

//		for(int i = 0; i<array.length; i++)
//		{
//			array[i];
//		}

		for (int a : array) // 把计Τㄢじ跑计皚
		{
			System.out.println(a); // foreach碞琌р皚ㄓ礛パ玡じ跑计更
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 10;
			System.out.println(array[i]);
		}

		for (int i : array) {
			i = i * 100;
			System.out.println(i);
		}

		for (int i : array) // foreach 礚猭э跑皚柑ず甧!!ノ癸禜琌跑计i~~
		{
			System.out.println(i);
		}

	}

}
