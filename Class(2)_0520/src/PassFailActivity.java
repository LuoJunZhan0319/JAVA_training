
public class PassFailActivity extends GradedActivity

{
	double minPassing;							//�ή����
	
	public PassFailActivity(double minPassing)
	{
		this.minPassing = minPassing;
	}
	
	public char getGrade()
	   {
	      char letterGrade;

	      if (this.getScore() >= this.minPassing )
	         letterGrade = 'p';
	      else
	         letterGrade = 'N';

	      return letterGrade;
	   }
}
