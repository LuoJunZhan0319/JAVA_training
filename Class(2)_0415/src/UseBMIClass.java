public class UseBMIClass 
{
	public static void main(String[] args) 
	{
		BMI bmi1 = new BMI("John Doe", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus(bmi1.getBMI()));

		BMI bmi2 = new BMI("Peter King", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus(bmi2.getBMI()));
	}
}

class BMI
{
	String name;
	int age;
	double weight;
	double height;
	
	public BMI(String name, int age, double weight, double height)
	{
		this.age = age;
		this.height = height;
		this.name = name;
		this.weight = weight;
	}
	
	public BMI(String name, double weight, double height)
	{
		this(name, 20, weight, height);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getBMI()
	{
		final double KGperPound = 0.45359237;
		final double MperInch = 0.0254;
		
		double w = this.weight * KGperPound;
		double m = this.height * MperInch;
		
		double bmi = w / (m*m);
		
		return Math.round((bmi*100.0))/100.0;
	}
	
	public static String getStatus(double bmi)
	{
//		<18.5: Underweight
//		[18.5, 25): Normal
//		[25, 30): Overweight
//		>30: Obese
		
		if(bmi < 18.5)
		{
			return "Underweight";
		}
		else if(bmi >= 18.5 && bmi < 25)
		{
			return "Normal";
		}
		else if(bmi >= 25 && bmi < 30)
		{
			return "Overweight";
		}
		else
			return "Obese";

	}
}