import java.util.Random;

//�o�D�O�ڬݵۦѮv�g���A�n�ۤv�A�Q�L��!!
//������ܷ|�ҡA���n!!!!!
public class Ch6_P40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=100; i++)
		{
			if( i%20 == 0  )
				System.out.print(randomChar('A','Z')+"\n");
			else
				System.out.print(randomChar('A','Z'));
		}
	}
	
	public static char randomChar(char c1, char c2)  //���]��J'A','E'
	{
		//��w��r���������üƥi�ܰʽd��
		int diff = c2 - c1 + 1;
		Random ran = new Random();
		int number = ran.nextInt(diff);  //�q{0,1,2,3,,,,,,}����@��
		
		// 'A' + 0 = 'A'
		// 'A' + 1 = 'B'
		// 'A' + 2 = 'C'
		
		return (char)(c1 + number);   //�j���૬�^�r�����A�B�_�h�|�OASCII����ƽX��!!!
	}


}
