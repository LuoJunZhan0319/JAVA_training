public class Lab3_11 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello"; // s1's2�����V�ۦP�������m
		String s3 = new String("hello"); // �o�˼g����`�ȡA�ҥH���|�b�w�ƪ��ɭԴN�����ͦn����A�n���쥿������{���A�s����hello����r��
		String s4 = new String("hello"); // �o�˼g����`�ȡA�ҥH���|�b�w�ƪ��ɭԴN�����ͦn����A�n���쥿������{���A�s����hello����r��
		// �]�N�O���b�̫�|�b����ϲ���3��hello!!!�As1's2�ɦV�P�@�ӡAs3,s4�U�ۤ@��!!

		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println("s3=" + s3);
		System.out.println("s4=" + s4);

		if (s1 == s2)
			System.out.println("s1=s2");
		else
			System.out.println("s1 s2 different");

		if (s3 == s4)
			System.out.println("s3=s4");
		else
			System.out.println("s3 s4 different");

	}
}