import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("�п�J�@�ӥ����");
		int num = in.nextInt();
		int sum = 0;
		while (num != 0) // ���u�ݭn����P�_�Ϭq�A�u�n�ŦX���N�|�@�����@�����A������󤣦A�ŦX����!!!!!
		{
			sum += num;
			System.out.print("���~���J�@�ӥ����");
			num = in.nextInt();
		}
		System.out.print("�z�ҿ�J���`�M~~ " + sum);

	}

}
