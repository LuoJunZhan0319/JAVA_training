import java.util.Arrays;
import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		
		
		
		char[] chr = new char[20];
		double[] array, array2 ;
		double sum = 0, div2 ;
		int i , j, k, o, div;
		
		
		//�ϥΪ̷Q�n��J�X��
		int count = in.nextInt();
		
		//���e�����o���ƪ�enter
		in.nextLine();
		
		for(i=0; i<count; i++)
		{
			//���o�ϥΪ̿�J���
			String num = in.nextLine();
			
			//�r����X�r����J�}�C
			for(j=0, k=0; j<num.length(); j+=2,k++) //���ɪ�k��chr[]�}�C����
				chr[k] = num.charAt(j);
			
			//�إ�double�}�C�ΨӦs��e��۴�ơA�G���״�@
			array = new double[k-1];
			
			//�N�e��۴�Ʃ�J�s�}�C
			for(j=0 ; j<(k-1); j++)
			{	
				div = chr[j+1] - chr[j];
				array[j] = Math.sqrt(Math.pow(div, 2));
			}
			
			//�N�s�}�C�Ƨ�
			Arrays.sort(array);
			
			//�إ߼з�jolly�}�C,�j�p�P�s�}�C�ۦP
			array2 = new double[k-1];
			for(j=0;j<k-1 ; j++)
				array2[j]=j+1;
			
			//�s�}�C��з�jolly�}�C���M����0
			for(j=0 ;j<k-1; j++) 
			{
				div2 = array[j] - array2[j];
				sum += div2;
			}	
			
			//�P�_�O�_��jolly
			if(sum == 0)
				System.out.println("jolly");
			else
				System.out.println("not jolly");
				
			
			
		}
		
		
		
		
			
		}
		
		

	}
	



