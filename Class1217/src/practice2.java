import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("�п�J���ӥ����");
		// ���[�Ů檩
//		String[] array = new String[5];
//		String S = in.nextLine();
//		
//		
//		char[] array2 = new char[5];
//		
//		for(int i=0; i<array.length; i++)
//			array2[i] = S.charAt(i);
//		
//		System.out.print("�п�J�A�Q�d�ߪ���m�������");
//		String D = in.nextLine();
//		char d = D.charAt(0);
//		
//		for(int j = 4; j>=0; j--)
//		{
//			if (d == array2[j])
//			{
//				System.out.print(d + "�̫�@���X�{�b ["  + j +  "]" );
//				break;
//			}
//		}

		// ²����(��J�ɭn�[�Ů�)
//		int[] array = new int[5];
//		for(int i = 0; i<array.length; i++)
//			array[i] = in.nextInt();
//		
//		
//		System.out.print("�п�J�A�Q�d�ߪ���m�������");
//		int n = in.nextInt();
//		
//		for(int j = 4; j>=0; j--)
//			{
//				if (n == array[j])
//				{
//					System.out.print(n + "�̫�@���X�{�b ["  + j +  "]" );
//					break;
//				}
//			}

		// �o�Dpos�گu�����|��
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++)
			array[i] = in.nextInt();

		System.out.print("�п�J�A�Q�d�ߪ���m�������");
		int query = in.nextInt();

		int count = 0; // �d�߼Ʀr�X�{������
		int pos = -1; // �̫�@���Ʀr�X�{����m //�]-1�O�ߺD��-->�����o�ӪF��N�n�Q���л\��

		for (int i = 0; i < array.length; i++) {
			if (array[i] == query) {
				count++;
				pos = i;
			}

		}

		if (count > 1)
			System.out.println(query + "�̫�@���X�{�b [" + pos + "]");
		else
			System.out.println(query + "�X�{�b [" + pos + "]");

	}

}
