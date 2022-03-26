import javax.swing.JOptionPane;  // Needed for JOptionPane class
//對話框功能來源
/**
   This program demonstrates a nested if statement.
*/

public class LoanQualifier
{
   public static void main(String[] args)
   {
      double salary;       // Annual salary
      double yearsOnJob;   // Years at current job
      String input;        // To hold string input

      // Get the user's annual salary.
      //JOptionPane.showInputDialog 跟使用者要資料
      input = JOptionPane.showInputDialog("Enter your " + 
                                       "annual salary.");
      
      salary = Double.parseDouble(input); //把小數型字串轉換成小數

      // Get the number of years at the current job.
      input = JOptionPane.showInputDialog("Enter the number of " +
                                    "years at your current job.");
      yearsOnJob = Double.parseDouble(input);

      // Determine whether the user qualifies for the loan.
      if (salary >= 30000)
      {
         if (yearsOnJob >= 2)
         {
        	//JOptionPane.showMessageDialog 只顯示訊息資料不跟使用者要資料
        	//JOptionPane.showMessageDialog 第一個參數表示不指定位置
            JOptionPane.showMessageDialog(null, "You qualify " +
                                               "for the loan.");
         }
         else
         {
        	//JOptionPane.showMessageDialog 只顯示訊息資料不跟使用者要資料
            JOptionPane.showMessageDialog(null, "You must have " +
                        "been on your current job for at least " + 
                        "two years to qualify.");
         }
      }
      else
      {
            JOptionPane.showMessageDialog(null, "You must earn " +
                         "at least $30,000 per year to qualify.");
      }
      
      System.exit(0); 
      //當使用有圖形對話框時很常用，用來告訴成是我們要結束此程式了，
      //請清除GUI開啟的主記憶體空間
   }
}
