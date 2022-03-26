import java.io.*;  // For File class and FileNotFoundException
import java.util.Scanner;       // For the Scanner class
import javax.swing.JOptionPane; // For the JOptionPane class

/**
   This program demonstrates how a FileNotFoundException
   exception can be handled.
*/

public class OpenFile
{
   public static void main(String[] args)
   {
      File file;         // For file input
      Scanner inputFile; // For file input
      String fileName;   // To hold a file name

      // Get a file name from the user.
      fileName = JOptionPane.showInputDialog("Enter " +
                                "the name of a file:");

      // Attempt to open the file.
      try											//�䤣���ɮת��y�{A			//�����ɮ׬y�{B
      {
         file = new File(fileName);					//A1					//B1
         inputFile = new Scanner(file);				//A2					//B2
         JOptionPane.showMessageDialog(null, 								
                          "The file was found.");	//�bA�����p�U�A�L���|����		//B3
      }
      catch (FileNotFoundException e)				//A3					//catch �L���|����
      {
         JOptionPane.showMessageDialog(null, 		//A4
                               "File not found.");
      }
      
      JOptionPane.showMessageDialog(null, "Done.");	//A5					//B4
      System.exit(0);
   }
}