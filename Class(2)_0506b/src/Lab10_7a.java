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
      
      // 建立了myCourse之後，來變動myInstructor，請問myCourse是否受到影響？   
      // *****沒有!!因為myInstructor是舊老師物件被改變資料，不會影響myCourse所產生的新老師物件資料!!
      
      myInstructor.set("liao", "gen-yih", "mb501");
      
      // Display the course information.
      System.out.println(myCourse);
   }
}