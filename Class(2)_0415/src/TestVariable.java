
public class TestVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A amanda = new A();
		A bob = new A();
		
		amanda.v1 = 10;
		bob.v1 = 20;
		
	}

}


class A
{
	int v1;				//�����ܼ�(global variable)[�S�����Wstatic] : ����ܼ�
	
	static int v2;		//�����ܼ�(global variable)[�����Wstatic] : ���O�ܼ�
	
	public A()
	{
		int v3;			//�ϰ��ܼ�(local variable)�L�k���k�ϥ�
		v2 = 90;		//�Ҧ���������O��k���i�ϥα��Wstatic�������ܼ�
		
	}
	
	public static void B()
	{
		v2 = 90;		//�Ҧ���������O��k���i�ϥα��Wstatic�������ܼ�
		v1 = 10;		//�S��static�������ܼƥu�A�Φb�����k���A�L�k�Φb���O��k
	}
	
	public void m1()
	{
		v1 = 10;		//�S��static�������ܼƥu�A�Φb�����k���A�L�k�Φb���O��k
		v3 = 90;		//�Ȧ���k��; �ͩR�g���P��k�ۦP; �ëD�@�Ӫ���@��
	}
	
}