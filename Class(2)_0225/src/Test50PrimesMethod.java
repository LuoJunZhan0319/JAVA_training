
public class Test50PrimesMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstPrime(50);
		
	}
	
	public static void firstPrime(int x)
	{
		int num = 2; //�_�l��
		
		
		//�p�ƾ�,�L�X�ex�ӽ��
		for(int count=0; count<x; num++)
		{
			if(isPrime(num))
			{
				count++;
				System.out.println(num);
			}
				
		}
	}
	
	public static boolean isPrime(int num)
	{
		//�Y�O��Ʀ^��true�A�_��false
		boolean check = true;
		
		//�P�_�_�l�ƬO�_�����
		for(int init=2 ; init<num; init++)
		{
			//�d�U���O��ƪ��Ҿ�
			if(num % init == 0)
				check = false;
		}
		
		return check;
		
	}

}
