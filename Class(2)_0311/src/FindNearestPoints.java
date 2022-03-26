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
		//Math.sqrt()  計算平方根
		//Math.pow()	計算次方
		double temp = 0;
		temp = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
		return temp;
	}
	
	public static double[][] readPoints() throws FileNotFoundException //從檔案中讀取資料
	{
		double[][] temp = new double[100][2];  //100是刻意多留空間的決定
		
		
		File testFile = new File("point.txt");
		Scanner in = new Scanner(testFile);
		
		int count = 0;  //計數器
		while(in.hasNext())   //是否還有資料可以讀
		{
			
			temp[count][0] = in.nextDouble();
			temp[count][1] = in.nextDouble();
			
			count++;
					
		}
		
		//這邊用copyOf()是因為Array一開始設定的大小是100，因為已經讀完了所以只要回傳有數值的部分即可
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
		
		System.out.println(("("+array[a][0]+","+array[a][1]) +") ， ("+ (array[b][0]+","+array[b][1])+") 此兩點最近，距離為"+ min);
	}
	


}
