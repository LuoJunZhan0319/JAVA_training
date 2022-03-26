/**
   This program demonstrates the Course class.
*/

public class CourseDemo1
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
      
      // Display the course information.
      System.out.println(myCourse);
      
      TextBook newBook = myTextBook;
      Course dataStructure = new Course("data structure", myInstructor, newBook);
      
      System.out.println(dataStructure);
   }
}