
public class test {

	enum Day {SUNDAY, MONDAY , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	
	public static void main(String[] args) {
		
		int a = 9;
		
		Day MothersDay = Day.SUNDAY;
		// Day FathersDay = Day.SUNDAYS; �������C�|���A��ƪ���ҡA�]�N�O�b�j�A���̭��Q�w�q
		
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
