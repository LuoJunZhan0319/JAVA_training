import java.util.*;
public class Lab2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		double score = 0;
		int cp = 0;
		// double w2 = 1.88; //�ŧi�ܼƥN��@�Ӹ�ƭ�
		final double w2 = 1.88; //�ŧiw2�`�ơA�N��@�Ӥ��i�Q���ܪ���
		System.out.println("please input �D��1:");
		int a = keyboard.nextInt();
		score += a * 3.2;          // ���W�D���v��
		
		System.out.println("please input �D��2:");
		double b = keyboard.nextDouble();
		score += b * 3.2;         // ���W�D���v��

		System.out.println("please input �D��3:");
		double c = keyboard.nextDouble();
		score += c * 3.2;         // ���W�D���v��

		System.out.println("please input �Ƭ�1:");
		int d = keyboard.nextInt();
		score += d * w2;           // ���W�Ƭ��v��

		System.out.println("please input �Ƭ�2:");
		int a2 = keyboard.nextInt();
		score += a2 * w2;        // ���W�Ƭ��v��

		System.out.println("�[�v�`�� = "+score);
	}

}