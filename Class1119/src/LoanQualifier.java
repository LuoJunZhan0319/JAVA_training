import javax.swing.JOptionPane;  // Needed for JOptionPane class
//��ܮإ\��ӷ�
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
      //JOptionPane.showInputDialog ��ϥΪ̭n���
      input = JOptionPane.showInputDialog("Enter your " + 
                                       "annual salary.");
      
      salary = Double.parseDouble(input); //��p�ƫ��r���ഫ���p��

      // Get the number of years at the current job.
      input = JOptionPane.showInputDialog("Enter the number of " +
                                    "years at your current job.");
      yearsOnJob = Double.parseDouble(input);

      // Determine whether the user qualifies for the loan.
      if (salary >= 30000)
      {
         if (yearsOnJob >= 2)
         {
        	//JOptionPane.showMessageDialog �u��ܰT����Ƥ���ϥΪ̭n���
        	//JOptionPane.showMessageDialog �Ĥ@�ӰѼƪ�ܤ����w��m
            JOptionPane.showMessageDialog(null, "You qualify " +
                                               "for the loan.");
         }
         else
         {
        	//JOptionPane.showMessageDialog �u��ܰT����Ƥ���ϥΪ̭n���
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
      //��ϥΦ��ϧι�ܮخɫܱ`�ΡA�Ψӧi�D���O�ڭ̭n�������{���F�A
      //�вM��GUI�}�Ҫ��D�O����Ŷ�
   }
}
