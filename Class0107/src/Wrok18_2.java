import java.util.ArrayList;
import java.util.Scanner;
public class Wrok18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("�п�J�Q�ӥ����: ");
		
		Scanner in = new Scanner(System.in);
		
		//�إ�ArrayList �ín�D��J��ƫ��A
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		//���o�ϥΪ̿�Jadd�i��C
		for(int i = 0; i<10; i++)
		{
			List.add(in.nextInt());
		}
		
		//���L�X�Ĥ@�Ӥ���
		System.out.print(List.get(0)+" ");
		
		//���̧ۨǦV�e���O�_���ƦL�X
		for(int i = 1; i<List.size(); i++)
		{
			//�إ߿�O�Ҿ� ��l��true (�@�w�n�]�b�@�}�l�A�N�Ҿڭ��])
			boolean identify = true;
			
			//�V�e���
			for(int j = 0; j<i; j++)
			{	
				if(List.get(i) == List.get(j))
				{	
					//��쭫���ҾڡA�N����j��
					identify = false;
					break;
				}
			}
			
			//��O�ҾڬO�_��ture�A�L���ƴN�L�X��e����
			if(identify)
				System.out.print(List.get(i)+" ");
			
		}
		
		
	}

}
