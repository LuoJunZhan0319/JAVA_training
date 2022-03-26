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
		
		
		//使用者想要輸入幾次
		int count = in.nextInt();
		
		//拿前面取得次數的enter
		in.nextLine();
		
		for(i=0; i<count; i++)
		{
			//取得使用者輸入資料
			String num = in.nextLine();
			
			//字串取出字元放入陣列
			for(j=0, k=0; j<num.length(); j+=2,k++) //此時的k為chr[]陣列長度
				chr[k] = num.charAt(j);
			
			//建立double陣列用來存放前後相減的數，故長度減一
			array = new double[k-1];
			
			//將前後相減的數放入新陣列
			for(j=0 ; j<(k-1); j++)
			{	
				div = chr[j+1] - chr[j];
				array[j] = Math.sqrt(Math.pow(div, 2));
			}
			
			//將新陣列排序
			Arrays.sort(array);
			
			//建立標準jolly陣列,大小與新陣列相同
			array2 = new double[k-1];
			for(j=0;j<k-1 ; j++)
				array2[j]=j+1;
			
			//新陣列減標準jolly陣列之和應為0
			for(j=0 ;j<k-1; j++) 
			{
				div2 = array[j] - array2[j];
				sum += div2;
			}	
			
			//判斷是否為jolly
			if(sum == 0)
				System.out.println("jolly");
			else
				System.out.println("not jolly");
				
			
			
		}
		
		
		
		
			
		}
		
		

	}
	



