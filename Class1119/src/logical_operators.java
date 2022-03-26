import javax.swing.JOptionPane;
public class logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary;       // Annual salary
	      double yearsOnJob;   // Years at current job
	      String input;        // To hold string input

	
	      input = JOptionPane.showInputDialog("Enter your " + 
	                                       "annual salary.");
	      
	      salary = Double.parseDouble(input); 

	      // Get the number of years at the current job.
	      input = JOptionPane.showInputDialog("Enter the number of " +
	                                    "years at your current job.");
	      yearsOnJob = Double.parseDouble(input);

	      // Determine whether the user qualifies for the loan.
	      if (salary >= 30000 && yearsOnJob >= 2)
	         JOptionPane.showMessageDialog(null, "You qualify for the loan.");
	      
	      else  
	         JOptionPane.showMessageDialog(null, "not qualify.");
   
	      System.exit(0); 
	      
	      
	}

}
