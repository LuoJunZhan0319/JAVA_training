import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();;  //�ŧi��C�ܼơA�����������
		
		//List�N���O�@�ӲM��!! ���۴��R��d����O!!!(�D�`�n��)
		list.add("Amanda");
		list.add("Bob");
		list.add("Alice");
		System.out.println(list);
		
		list.remove(1);  //������C���ި쪺����
		System.out.println(list);
		
		list.add(1,"Toby");  //�b���w���ަ�m�[�J����
		System.out.println(list);
		
		//�d
		for(int i = 0; i<list.size(); i++)  //��C���n�d�ߤj�p�����ϥ�size�A�Ӥ��Olength
		{
			System.out.println(list.get(i));  //�n���o��C�̭�����T�A�ݭn�ϥ�ArrayList.get()���o
		}
		
		//��
		list.set(0, "Alan");  //�b���w���ަ�m���ܤ���
		System.out.println(list);
		
		list.clear();  //�M�Ŧ�C
		System.out.println(list);
		

	}

}
