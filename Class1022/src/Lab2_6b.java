public class Lab2_6b {

	public static void main(String[] args) {
		double d1 = 3.4;
		int d2 = (int) d1;

		System.out.println("d1:" + d1);	// d1 ���e�O�_�Qcast�B��ҧ���?
		System.out.println("d2:" + d2);
		
		System.out.println(5/2); //��ư��k�A�ҥH�u�|��2
		System.out.println( (double)5/2 ); //�j���ƫ��A�ഫ(Cast)���u�����ǫܰ�,���|�u����5��5.0�A���H2
		System.out.println( 5/(double)2 ); //�j���ƫ��A�ഫ(Cast)���u�����ǫܰ�,���|�u����2��2.0�A����5
		
		
	}

}