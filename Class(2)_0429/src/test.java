
public class test {

	enum Day {SUNDAY, MONDAY , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	
	public static void main(String[] args) {
		
		int a = 9;
		
		Day MothersDay = Day.SUNDAY;
		// Day FathersDay = Day.SUNDAYS; 必須為列舉型態資料的實例，也就是在大括號裡面被定義
		
		System.out.println(MothersDay.ordinal());
		
		Day FathersDay = Day.THURSDAY;
		
		int aa = FathersDay.ordinal();
		System.out.println(aa);
		
		Day[] days = Day.values();
		
		for(int i = 0; i < days.length; i++ )
		{
			System.out.println(days[i]);
		}
	}

}
