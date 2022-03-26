import java.util.Scanner;

public class Test50CompositeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input N: ");
		int num = in.nextInt();
		
		
		firstComposite(num);

	}
	


	public static void firstComposite(int x)
	{
		int num = 4; //�_�l��
		
		
		//�p�ƾ�,�L�X�ex�ӽ��
		for(int count=0; count<x; num++)
		{
			if(isComposite(num))
			{
				count++;
				System.out.print(num+" : ");
				
				for(int i = 2; i<=num; i++)
				{
					if(num % i == 0)
						System.out.print(i+" ");
				}
				System.out.println();
			}
				
		}
	}
	
	public static boolean isComposite(int num)
	{
		//���]�_�l�Ƥ��O�X��
		boolean check = false;
		
		//�P�_�_�l�ƬO�_���X��
		for(int init=2 ; init<num; init++)
		{
			//�d�U�O�X�ƪ��Ҿ�
			if(num % init == 0)
				check = true;
		}
		
		return check;
	}
}
