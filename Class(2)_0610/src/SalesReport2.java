 import java.io.*;    // For File class and FileNotFoundException
 import java.util.*;  // For Scanner and InputMismatchException
 import java.text.DecimalFormat; // For the DecimalFormat class
 import javax.swing.JOptionPane; // For the JOptionPane class
 
 /**
    This program demonstrates how exception handlers can
    be used to recover from errors.
 */
  
 public class SalesReport2
 {
    public static void main(String[] args)
    {
       String filename = "SalesData.txt"; // File name
       int months = 0;                    // Month counter
       double oneMonth;                   // One month's sales
       double totalSales = 0.0;           // Total sales
       double averageSales;               // Average sales
 
       // Attempt to open the file by calling the
       // openfile method.
       Scanner inputFile = openFile(filename);
       
       // If the openFile method returned null, then
       // the file was not found. Get a new file name.
       while (inputFile == null)
       {
          filename = JOptionPane.showInputDialog(
                         "ERROR: " + filename +
                         " does not exist.\n" +
                         "Enter another file name: ");
          inputFile = openFile(filename);
       }
 
       // Process the contents of the file.
       while (inputFile.hasNext())
       {
          try
          {
             // Get a month's sales amount.
             oneMonth = inputFile.nextDouble();
  
             // Accumulate the amount.
             totalSales += oneMonth;
                
             // Increment the month counter.
             months++;
          }
          catch(InputMismatchException e)
          {
             // Display an error message.
             JOptionPane.showMessageDialog(null,
                "Non-numeric data found in the file.\n" +
                "The invalid record will be skipped.");
             
             // Skip past the invalid data.
             inputFile.nextLine();
          }
       }
 
       // Close the file.
       inputFile.close();
 
       // Calculate the average.
       averageSales = totalSales / months;
 
       // Display the results.
       JOptionPane.showMessageDialog(null,
    	         String.format("Number of months: %d\n" +
                         "Total Sales: $%,.2f\n" +
                         "Average Sales: $%,.2f",
          		       months, totalSales, averageSales));
       System.exit(0);
    }
 
    /**
       The opeFile method opens the specified file and
       returns a reference to a Scanner object.
       @param filename The name of the file to open.
       @return A Scanner reference, if the file exists
               Otherwise, null is returned.
    */
 
    public static Scanner openFile(String filename)
    {
       Scanner scan;
 
       // Attempt to open the file.
       try
       {
          File file = new File(filename);
          scan = new Scanner(file);			//整行執行完畢:scan會是可以掃描檔案的檔案掃描器
       }
       catch(FileNotFoundException e)
       {
          scan = null;						//第93行只執行右半:scan是null
       }
 
       return scan;
    }
 }
