
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcde";
		int a = 0;								//�ҥH�U���nprint(a)�N�n��l��

		
		try
		{
			a = 10 / 0;							//�q�����{��try�̭�������l�Ƥ��@�w�|�����C
			a = Integer.parseInt(s);
			System.out.println(a);
		}
		catch(NumberFormatException nfe)		//��������H�~���|��
		{
			System.out.println("NumberFormatException");
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException");
		}

		
		System.out.println(a); //�ܼƪ�l�ƨ̾ڰ϶��өw
	}

}
