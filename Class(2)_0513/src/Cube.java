
public class Cube extends Rectangle
{
	double side;						//��ܥ����骺����
	
	public Cube(double d)
	{
		super(d, d);					//����Rectangle���ͤ@�Ӫ���ΡB�N��ߤ��骺��
		side = d;
	}
	
	
	public double getSurfaceArea()
	{
		//����²
//		double sum_Area = getArea()*6;
//		return sum_Area;
		
		return getArea()*6;
	}
	
	public double getVolume()
	{
		//����²
//		double volume = getArea()*side;
//		return volume;
		
		return getArea()*side;
	}
	
	public double getHeight() 
	{
		return side;
	}

}
