import java.util.Random;
import java.util.Scanner;

public class parctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�A�n���j���Y�٬O�p�ֳz\n�n���j�ֳz�Ы��UB��b; �p�ֳz�Ы��US��s;��L���䤤��C��");
		Scanner in = new Scanner(System.in);
		String ans = in.nextLine();

		Random rand = new Random();

		switch (ans) {
		case "b":
		case "B":
			System.out.println("�i��j�ֳz�C��\n�п�J�@�Ӥ���[1,10]�����");
			int a = rand.nextInt(10) + 1;
			int b = in.nextInt();
			if (a == b)
				System.out.println("���T!�������");
			else
				System.out.println("��p�A���T���׬�" + a);
			break;
		case "s":
		case "S":
			System.out.println("�i��p�ֳz�C��\n�п�J�@�Ӥ���[1,2]�����");
			int c = rand.nextInt(2) + 1;
			int d = in.nextInt();
			if (c == d)
				System.out.println("���T!�������");
			else
				System.out.println("��p�A���T���׬�" + c);
			break;

		default:
			System.out.println("�z��ܤ���C��");
		}

	}

}
