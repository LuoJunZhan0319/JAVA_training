
public class printMonthBody1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startday = 5; //2021.01.01�O�P���� -->�Ĥ@��Ť���
		
		for(int i = 0; i < startday; i++)
		{
			System.out.printf("%3s"," ");
		}
		
		for(int i = 1; i <= 31; i++)		//�]���O�C�L1��A�ҥH�O31��
		{
			System.out.printf("%3d",i); //�L�X���
			
			if((i+startday)%7 == 0)     		//�]���O�C�L2021�~1��A�ҥH�n�[��
			{
				System.out.println();
			}
		}

	}

}
