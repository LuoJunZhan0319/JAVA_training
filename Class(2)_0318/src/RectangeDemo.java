
public class RectangeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle a = new Rectangle();	//1(會去Retangle看一下，沒建構式就往下繼續執行)
		
		a.setLength(10);				//2
		a.setWidth(5);					//4
		System.out.println(a.getArea());	//6(去找方法執行)	 //11

	}									//12

}
