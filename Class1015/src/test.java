
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		byte b = 5;
		short c = 32767;
		
		//�o���ı�o�W���n!!!!!�n���e���o�쪺����
		//�X�G�i�H�o�X�@�ӵ��סA�u�n����Literal����ƭȡA���|�Qjava�u���{���Oint�A�A�̾ڥ����ܼƪ�type�Ӱ��૬
		//literal���ȲŦX�����ܼƪ��ȡA�N�i�H�����૬�H�W������ byte b = (byte)5; �ҥH��`�Ȥj�����ܼƪ�type�d��
		//�h�|���X<error>type mismatch �i�D�A���䪺�`�ȵL�k�qint�ഫ����type
		//�Ӥw�U������ int a1 = 2147483648;���䫬�A��곣�Oint�A���k��literal�W�Lint���d��
		//�ҥH����<error>�N�|���Othe literal 2147483648 is .. out of range�A���|�Otype mismatch
		//�U�C���p�~�|�Q��<error>type mismatch �L�k�qlong��int  int a4 = 2147483648L
		
		
		
//		short c1 =32768;     //<error>type mismatch: can,t convert from int to short
//		int a1 = 2147483648; //<error> the literal 2147483648 is .. out of range
//		long a2 = 2147483648;//<error> ����ƪ�F�覡�Ӥj 
//		long a3 = 2147483648L; 
//		//�]��Literal�w�g�W�Lint���W���A���F��java�{���]�p�v�T�w�ۤv�n�u�γo��j���Ʀr�A���A�[�WL�T�w�A�n�ϥγolong
//		int a4 = 2147483648L;//<error>type mismatch: can,t convert from long to int
//		
//		
//		//float number = 0.2;<error>type mismatch: can,t convert double int to float
//		// literal �u�n���p���I�A�{���۰ʻ{���Odouble!!
//		float f = 0.2F;
//		
		//�o��]�ܭ��n�A�b��+-*/���n�`�N��ƫ��A�|�v�T���G�A���n�b�o�̱ѵ��F!!!!
		System.out.println(5 / 2);  // int
		System.out.println(5 / 2.0);// int/double
		System.out.println(5.0 / 2);// double/int
		System.out.println(100 + 58 % 10 - 5);
//		
//		
//		int upper = 3;
//		int base = 4;
//		
//		System.out.println(Math.pow(base,upper)); //Math.pow()  ��double type
//		System.out.println(Math.sqrt(Math.pow(base,upper)));
		
		
		String s = "amanda"; //String is complex
		System.out.println(s.length());
		String s1 = ""; 
		System.out.println(s.length());
		
		String user = "yes";  //java �w��ǦC�ʸ�ƪ���m�A���O�q0�}�l��
		
		System.out.println(user.charAt(0));
		
		System.out.println(user.toUpperCase()); //�èS����user�̭�����Ƨ令�j�g
		
		System.out.println(user); 
		
		
		
		char  c1 = user.charAt(2); //�r�����A
		
		// String  c2 = user.charAt(2);//user.charAt() �^��type char
		
		System.out.println(c1);
	}

}
