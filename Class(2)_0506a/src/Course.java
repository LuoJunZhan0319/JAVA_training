
public class Course {

	String courseName;
	Instructor instr;
	TextBook tb;
	
	public Course(String c, Instructor i, TextBook t )
	{
		courseName = c;
		instr = i;
		tb = t;
	}
	
	public String toString()								// 2
	{
		String result = "";									// 3
		
		result += "Course name: " + courseName + "\n\n";	// 4
		result += "Instructor Information: \n";				// 5
		result += instr;								// 6 13
		result += "Textbook: \n";							// 14 21
		result += tb;									    // 22
		
		return result;										// 23
	}
}
