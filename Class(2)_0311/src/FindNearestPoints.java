import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FindNearestPoints {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		double[][] array = readPoints();
		getMinNearestPoints(array);
		
	}
	
	
	public static double distence(double x1, double y1, double x2, double y2)
	{
		//Math.sqrt()  �p�⥭���
		//Math.pow()	�p�⦸��
		double temp = 0;
		temp = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
		return temp;
	}
	
	public static double[][] readPoints() throws FileNotFoundException //�q�ɮפ�Ū�����
	{
		double[][] temp = new double[100][2];  //100�O��N�h�d�Ŷ����M�w
		
		
		File testFile = new File("point.txt");
		Scanner in = new Scanner(testFile);
		
		int count = 0;  //�p�ƾ�
		while(in.hasNext())   //�O�_�٦���ƥi�HŪ
		{
			
			temp[count][0] = in.nextDouble();
			temp[count][1] = in.nextDouble();
			
			count++;
					
		}
		
		//�o���copyOf()�O�]��Array�@�}�l�]�w���j�p�O100�A�]���w�gŪ���F�ҥH�u�n�^�Ǧ��ƭȪ������Y�i
		return Arrays.copyOf(temp, count);     
	}
	
	public static void getMinNearestPoints(double[][] array)
	{
		double min = 100.0;
		int a = 0, b = 0;
		double dis = 0;
		
		
		for(int i = 0; i < array.length-1; i++)
		{
			for(int j = i+1; j < array.length; j++)
			{
				dis = distence(array[i][0], array[i][1], array[j][0], array[j][1]);
				if(min > dis)
				{
					min = Math.round((dis*100))/100.0 ;
					a = i;
					b = j;
				}
			}
		}
		
		System.out.println(("("+array[a][0]+","+array[a][1]) +") �A ("+ (array[b][0]+","+array[b][1])+") �����I�̪�A�Z����"+ min);
	}
	


}
