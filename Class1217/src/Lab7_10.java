public class Lab7_10 {
	public static void main(String[] rgs) // �ܼƦW�٥i�ѵ{���]�p�v�ۭq
											// �o�̤��@�w�n�gargs
	{

		// �W�b�{�����Afor�j��O���ӧO�}�C���Ѧ��ܼ�(subject1, subject2)�Ө��ΰ}�C����

		int[] subject1 = { 60, 70, 30, 80, 90 };
		int[] subject2 = { 90, 70, 55, 70 };

		int sum = 0;
		int[] subject = new int[5];
		subject = subject1;

		// �Q�ΩI�s��k�Ӽ��g
		sum = sum(subject1);
		System.out.println("�Ĥ@�쥭��=" + sum / subject1.length);

		sum = sum(subject2); // �Nsubject2�}�C�ǵ�sum��k���B��A�A�N�B�⵲�G�ˤJsum�ܼ�
		System.out.println("�ĤG�쥭��=" + sum / subject2.length);

		// �U�b�{�����A���for�j�鮳�P�@�Ӱ}�C�Ѧ��ܼ�(arrayToProcess)�Ө��ΰ}�C����
		// �Ĥ@�Ӱj�鬰�F������T���βĤ@�Ӭ�ت��}�C�����A�����i��}�C�ѦҤ���������
		// arrayToProcess = subject1
		// �P�˦a�A�ĤG�Ӱj�鬰�F������T���βĤG�Ӭ�ت��}�C����
		// �]�����i��}�C�ѦҤ���������
		// arrayToProcess = subject2

		/*
		 * int[] arrayToProcess; // �N��n�B�z���}�C int sum = 0; arrayToProcess = subject1;
		 * for(int i = 0; i < arrayToProcess.length; i++) { sum += arrayToProcess[i]; }
		 * System.out.println("�Ĥ@�쥭��="+sum / arrayToProcess.length);
		 * 
		 * sum = 0; arrayToProcess = subject2; for(int i = 0; i < arrayToProcess.length;
		 * i++) { sum += arrayToProcess[i]; } System.out.println("�ĤG�쥭��="+sum /
		 * arrayToProcess.length);
		 */

	}

	public static int sum(int[] subject) {
		int summation = 0;

		for (int i = 0; i < subject.length; i++) // �w��subject�i�業���B��
		{
			summation += subject[i];
		}

		return summation;
	}

}