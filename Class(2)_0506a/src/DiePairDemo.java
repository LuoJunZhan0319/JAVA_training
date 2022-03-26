import java.util.ArrayList;

public class DiePairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] persons = {"amanda", "bob", "carol", "dennis", "ellie"};
		DiePair[] fivePersons = new DiePair[5];
		ArrayList<String> maxPerson = new ArrayList<String>();
		
		for(int i = 0; i < fivePersons.length; i++)
		{
			System.out.print("Rolling #"+(i+1)+" for "+persons[i]+":");
			fivePersons[i] = new DiePair();
			fivePersons[i].play();   // 耏蛮浑
			System.out.print("("+fivePersons[i].die_1.getValue()+",");
			System.out.println(fivePersons[i].die_2.getValue()+")");
		}
		
		// 叫耞蛮浑翴计㎝ぇ程の程
		
		
		int max = 0;
		for(int i = 0; i < fivePersons.length; i++)
		{
			if(i == 0)
			{
				maxPerson.add(persons[i]);
				max = fivePersons[i].getValue();
			}
			else if(i !=0 && fivePersons[i].getValue() > max)
			{
				maxPerson.clear();
				maxPerson.add(persons[i]);
				max = fivePersons[i].getValue();
			}
			else if(fivePersons[i].getValue() == max)
			{
				maxPerson.add(persons[i]);
			}
		}
		
		if(maxPerson.size() != 0)
		{
			for(int i = 0; i < maxPerson.size(); i++)
			{
				System.out.print(maxPerson.get(i)+" ");
			}
			
			System.out.print("琌"+max+"翴程");
		}
		
		else if(maxPerson.size() == 0)
		{
			System.out.println(maxPerson.get(0)+"琌"+max+"翴程");
		}
	}
}
