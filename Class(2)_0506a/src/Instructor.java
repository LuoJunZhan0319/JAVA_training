
public class Instructor {

	
	String lastName;
	String firstName;
	String officeNumber;
	
	public Instructor(String s1, String s2, String s3)
	{
		lastName = s1;
		firstName = s2;
		officeNumber = s3;
	}
	
	// copy constructor: �ѼƦP�����O���󪺫غc��
	// �i�H�`�٤@�Ǽ��g�Ѽƪ��ɶ�
	
	public Instructor(Instructor old)
	{
		lastName = old.lastName;
		firstName = old.firstName;
		officeNumber = old.officeNumber;
	}
	
	
	public String toString()									// 7
	{	
		String result = "";										// 8
		
		result += "Last name: " + lastName + "\n";				// 9
		result += "First name: " + firstName + "\n";			// 10 
		result += "officeNumber: " + officeNumber + "\n";		// 11
		
		return result;											// 12
	}
	
}
