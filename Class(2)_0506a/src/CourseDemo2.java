/**
   This program demonstrates the Course class.
*/

public class CourseDemo2
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
      
//      TextBook newBook = new TextBook(myTextBook);
      TextBook newBook = myTextBook;
      Instructor teacher2 = new Instructor(myInstructor);
      //Course dataStructure = new Course("data structure", myInstructor, newBook);
      Course dataStructure = new Course("data structure", teacher2, newBook);
      
      System.out.println(dataStructure);
      
      if(newBook == myTextBook)
      {
    	  System.out.println("same book");
      }
      else
      {
    	  System.out.println("books differ");
      }
      
      if(myCourse.instr == dataStructure.instr)
      {
    	  System.out.println("same teacher");
      }
      else
      {
    	  System.out.println("teachers differ");
      }
   }
}