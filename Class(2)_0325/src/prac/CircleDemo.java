package prac;


public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle1 c1 = new Circle1(3);
		Circle1 c2 = new Circle1(4);
		
		System.out.println("c1���b�|��="+c1.getRadius());
		System.out.println("c1����P����="+c1.getPerimeter());
		System.out.println("c1�����n��="+c1.getArea());
		
		System.out.println("c2���b�|��="+c2.getRadius());
		System.out.println("c2����P����="+c2.getPerimeter());
		System.out.println("c2�����n��="+c2.getArea());
		
		System.out.println("�ܰ�c1�b�|��5");
		c1.setRadius(5);
		
		System.out.println("c1���b�|��="+c1.getRadius());
		System.out.println("c1����P����="+c1.getPerimeter());
		System.out.println("c1�����n��="+c1.getArea());

	}

}
