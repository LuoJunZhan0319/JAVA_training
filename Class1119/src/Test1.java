import java.util.Scanner;

public class Test1 {
//Nested if(�_���Aif)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�п�A���嫬: ");
		String blood = in.nextLine();
		
		if (blood.length() == 1)
		{
			char c = blood.charAt(0);
			
			if(c == 'A')
				System.out.println("�Y�ϼL�W���u�S���Y�v�A�����ڥ��N�ܦ����Y");
			else 
			{
				if(c == 'B')
					System.out.println("�S���쪺�ƴN���藍�|�ʤ�h��");
				else
					System.out.println("�ݰ_�Ӥ���p�`�A�����ܷ|�Y�L");
			}
			//�U�C���k�]�i�H~�u�O�L���O�_����
//			if(c == 'A')
//				System.out.println("�Y�ϼL�W���u�S���Y�v�A�����ڥ��N�ܦ����Y");
//			if(c == 'B')
//				System.out.println("�S���쪺�ƴN���藍�|�ʤ�h��");
//			if(c == 'O')
//				System.out.println("�ݰ_�Ӥ���p�`�A�����ܷ|�Y�L");
		}
		else
		{
			System.out.println("�ݰ_�Ӧn�����bť�H���ܡA�����S��");
		}
		
		
		

	}

}
