import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a;  //int a;
		a = new Scanner(System.in);  //new Scanner(System.in): ����Scanner(����)���
		
		String number = a.nextLine();  //���o��ƫ��r��
		
		int num_int = Integer.parseInt(number); //�ഫ�����
		
		System.out.println(num_int*3);
		
		System.out.println("�п�J�@�ӤT���: ");
		int d3 = a.nextInt();  //123 --> "123"
		
		String d3_str = d3 + "";
		System.out.println(d3_str.charAt(1));
		
		
	}

}
