
public class DiePair {
	Die die_1 ;
	Die die_2 ;
	
	
	public DiePair()
	{
		die_1 = new Die(6);
		die_2 = new Die(6);
	}
	
	
	public int play()
	{
		die_1.roll();
		die_2.roll();

		return die_1.getValue()+die_2.getValue();
	}
	
	public int getValue()
	{
		return die_1.getValue()+die_2.getValue();
	}

}
