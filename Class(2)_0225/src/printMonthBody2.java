
public class printMonthBody2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startday = 5;	//2021.01.01�O�P���� -->�Ĥ@��Ť���
		startday =(5 + 31 + 28 + 31) % 7; //2021.01.01�O�P���� --> (5+31+28+31)%7 =>4
		
		for(int i = 0; i < startday; i++)
		{
			System.out.printf("%3s"," ");
		}
		
		for(int i = 1; i <= 30; i++)		//�]���O�C�L4��A�ҥH�O30��
		{
			System.out.printf("%3d",i); 	//�L�X���
			
			if((i+startday)%7 == 0)     	//�]���O�C�L2021�~1��A�ҥH�n�[��
			{
				System.out.println();
			}
		}

	}

}
