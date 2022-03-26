package prac;


public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle1 c1 = new Circle1(3);
		Circle1 c2 = new Circle1(4);
		
		System.out.println("c1的半徑為="+c1.getRadius());
		System.out.println("c1的圓周長為="+c1.getPerimeter());
		System.out.println("c1的面積為="+c1.getArea());
		
		System.out.println("c2的半徑為="+c2.getRadius());
		System.out.println("c2的圓周長為="+c2.getPerimeter());
		System.out.println("c2的面積為="+c2.getArea());
		
		System.out.println("變動c1半徑為5");
		c1.setRadius(5);
		
		System.out.println("c1的半徑為="+c1.getRadius());
		System.out.println("c1的圓周長為="+c1.getPerimeter());
		System.out.println("c1的面積為="+c1.getArea());

	}

}
