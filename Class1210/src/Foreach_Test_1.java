
public class Foreach_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 12, 13, 14, 15, 16, 17, 18 };

//		for(int i = 0; i<array.length; i++)
//		{
//			array[i];
//		}

		for (int a : array) // �ѼƦ���ӡA�@�Ӭ������ܼơA�@�Ӭ��}�C
		{
			System.out.println(a); // foreach�N�O��}�C�@�Ӥ@�Ӯ��X�ӡA�M��ѫe���������ܼƭ���
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 10;
			System.out.println(array[i]);
		}

		for (int i : array) {
			i = i * 100;
			System.out.println(i);
		}

		for (int i : array) // foreach �L�k���ܰ}�C�̭������e!!�]���@�ι�H�O�ܼ�i~~
		{
			System.out.println(i);
		}

	}

}
