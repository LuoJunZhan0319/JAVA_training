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
			fivePersons[i].play();   // �Y����l
			System.out.print("("+fivePersons[i].die_1.getValue()+",");
			System.out.println(fivePersons[i].die_2.getValue()+")");
		}
		
		// �Цb���P�_����l���I�ƩM����A�L�X�̤j�ȥH�γ̤j�Ȫ��H
		
		
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
			
			System.out.print("�O"+max+"�I���̤j��");
		}
		
		else if(maxPerson.size() == 0)
		{
			System.out.println(maxPerson.get(0)+"�O"+max+"�I���̤j��");
		}
	}
}
