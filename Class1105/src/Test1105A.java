
public class Test1105A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1+1=2
//	    2+2=4
//	    3+3=6
//	    4+4=8
//	    5+5=10
//�i�ƥv!!!!
		System.out.println("1+1=2");
		System.out.println("2+2=4");
		System.out.println("3+3=6");
		System.out.println(".......");
		
		System.out.println("1"+"+"+"1"+"="+"2");//��C�Ӧr���ܦ��r��
		System.out.println("2"+"+"+"2"+"="+"4");
		System.out.println("3"+"+"+"3"+"="+"6");
		System.out.println(".......");
		
		int x = 1;
		System.out.println(x +"+"+ x +"="+2*x);
		x = 2;
		System.out.println(x +"+"+ x +"="+2*x);
		x = 3;
		System.out.println(x +"+"+ x +"="+2*x);
		System.out.println(".......");
		
		
		for(int i = 1; i <= 5; i++)
			System.out.println(i+"+"+i+"="+(i+i));
		
		
		//1+2+3+4..+10=?
		int sum = 0 ;
		for(int i = 1; i <= 10; i++)
			sum += i;
		System.out.println(sum);

	}

}
