import java.util.Random;
import java.util.Scanner;

public class M0944018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �غc�T��ƶü�
		Random ra = new Random();
		int r = ra.nextInt(900) + 100;

		// int�૬String
		String s = r + "";

		// ���X�üƤ��C��ƪ��ƭ�
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);

		// ��ϥΪ̨��o���
		Scanner in = new Scanner(System.in);
		System.out.print("�п�J�@�Ӫ��ԧB�Ʀr(0~9):");
		int ans = in.nextInt();

		System.out.println("�q���ƦrR=" + r);

		// �ϥ�if�P�_�ϥΪ̸�ƻP�üƬO�_�ۦP!
		if (a == b && b == c) {
			if (a == ans) {
				System.out.print("�o��=1000");
			}
			System.out.print("�o��=-1000");
		} else if (a == b || a == c || b == c) {
			if (ans == a || ans == b || ans == c) {
				System.out.print("�o��=100");
			}
			System.out.print("�o��=-100");
		} else {
			System.out.print("0");
		}

	}

}
