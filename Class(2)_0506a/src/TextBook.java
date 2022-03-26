
public class TextBook {

	String title;
	String author;
	String publisher;
	
	public TextBook(String s1, String s2, String s3)
	{
		title = s1;
		author = s2;
		publisher = s3;
	}
	
	public String toString()							// 15
	{
		String result = "";								// 16
		
		result += "Title: " + title + "\n";				// 17
		result += "Author: " + author + "\n";			// 18
		result += "Publisher: " + publisher + "\n";		// 19
		
		return result;									// 20
	}
	
}
