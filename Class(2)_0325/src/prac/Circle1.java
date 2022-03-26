package prac;

class Circle1 {
	
	   private double radius;

	   public Circle1(double r)
	   {
	      radius = r;
	   }

	   public double getArea()
	   {
	      return Math.PI * radius * radius;
	   }

	   public double getRadius()
	   {
	      return radius;
	   }
	   
	   public double getPerimeter()
	   {
		   return 2*radius*Math.PI;
	   }
	   
	   public void setRadius(double r)
	   {
		   radius = r;
	   }
	   

}
