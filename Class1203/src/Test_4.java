import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ����");
		int num = in.nextInt();

		while (num < 1 || num > 100) // �]�i�H�g��while(!(num>=1 && num<=100)) -->!�i�H²��Q�����O���N��
		{
			System.out.print("�п�J�@�ӥ����");
			num = in.nextInt();
		}
		System.out.print("�X�檺�ƬO:" + num);

	}

}
