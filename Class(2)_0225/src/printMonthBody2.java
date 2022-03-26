
public class printMonthBody2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startday = 5;	//2021.01.01是星期五 -->第一行空五格
		startday =(5 + 31 + 28 + 31) % 7; //2021.01.01是星期五 --> (5+31+28+31)%7 =>4
		
		for(int i = 0; i < startday; i++)
		{
			System.out.printf("%3s"," ");
		}
		
		for(int i = 1; i <= 30; i++)		//因為是列印4月，所以是30天
		{
			System.out.printf("%3d",i); 	//印出日期
			
			if((i+startday)%7 == 0)     	//因為是列印2021年1月，所以要加五
			{
				System.out.println();
			}
		}

	}

}
