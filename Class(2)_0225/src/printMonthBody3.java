
public class printMonthBody3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


		int startday = getStartDay(2021, 3);
		
		for(int i = 0; i < startday; i++)
		{
			System.out.printf("%4s"," ");
		}
		
		for(int i = 1; i <= 31; i++)		
		{
			System.out.printf("%4d",i); 	
			
			if((i+startday)%7 == 0)     	
			{
				System.out.println();
			}
		}
	}
	
	
	public static int getStartDay(int year, int month) //���o�~�몺��䪺�Ĥ@��n�ŴX��
	{
		final int START_DAY_FOR_JAN_1_2021 = 5;			//�N��2021�~�@����Ĥ@�檺�e���ӪŮ�
		
		int totalNumberOfDays = getTotalNumberOfDays(year, month) + START_DAY_FOR_JAN_1_2021; //�I�sgetTotalNumberOfDays()��k���o�`�Ѽ�
		
		return totalNumberOfDays % 7;
	}
	
	public static int getTotalNumberOfDays(int year, int month)  //�p��q2021�~1���year�~month-1�몺�`�Ѽ�
	{
		//��l��
		int totalDay = 0;
		
		for(int i = 2021; i <= year ; i++)
		{
			if(year > 2021)
			{
				for(int j = 1; j <= 12; j++)
				{
					totalDay += getNumberOfDaysInMonth(i, j);
				}
			}
			else
			{
				for(int j = 1; j <= month-1; j++)
				{
					totalDay += getNumberOfDaysInMonth(i, j);
				}
			}
				
		}
		return  totalDay;
	}
	
	
	public static int getNumberOfDaysInMonth(int year, int month)
	{
		//��l�ƤѼ�
		int day = 0;
		
		// �w��S�w�~��year�~ month��,�^�ǸӤ릳�X��
			switch(month)
			{
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					day = 31;
					break;
				case 4: case 6: case 9: case 11:
					day = 30;
					break;
				case 2:
					if(isLeapYear(year))
						day = 29;
					else
						day = 28;
					break;
							
					
			}
		
		return day;
		
	}
	
	public static boolean isLeapYear(int year)
	{
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
		
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
