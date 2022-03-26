/**
   This program demonstrates the Course class.
*/

public class Lab10_7a
{
   public static void main(String[] args)
   {
      // Create an Instructor object.
      Instructor myInstructor =
          new Instructor("Kramer", "Shawn", "RH3010");
      
      // Create a TextBook object.
      TextBook myTextBook =
          new TextBook("Starting Out with Java",
                       "Gaddis", "Scott/Jones");
                       
      // Create a Course object.
      Course myCourse = 
         new Course("Intro to Java", myInstructor,
                    myTextBook);
      
      // �إߤFmyCourse����A���ܰ�myInstructor�A�а�myCourse�O�_����v�T�H   
      // *****�S��!!�]��myInstructor�O�¦Ѯv����Q���ܸ�ơA���|�v�TmyCourse�Ҳ��ͪ��s�Ѯv������!!
      
      myInstructor.set("liao", "gen-yih", "mb501");
      
      // Display the course information.
      System.out.println(myCourse);
   }
}