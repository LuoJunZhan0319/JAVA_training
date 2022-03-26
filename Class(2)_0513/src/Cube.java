
public class Cube extends Rectangle
{
	double side;						//表示正方體的高度
	
	public Cube(double d)
	{
		super(d, d);					//應用Rectangle產生一個長方形、代表立方體的底
		side = d;
	}
	
	
	public double getSurfaceArea()
	{
		//不精簡
//		double sum_Area = getArea()*6;
//		return sum_Area;
		
		return getArea()*6;
	}
	
	public double getVolume()
	{
		//不精簡
//		double volume = getArea()*side;
//		return volume;
		
		return getArea()*side;
	}
	
	public double getHeight() 
	{
		return side;
	}

}
