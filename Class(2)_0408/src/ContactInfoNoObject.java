import java.util.Scanner;

public class ContactInfoNoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
//		String[] stuNames = new String[3];
//		int[] stuAges = new int[3];
//		boolean[] stuSex = new boolean[3];
		
		Student[] students = new Student[3];
		
		for(int i = 0; i < 3; i++) 
		{
			students[i] = new Student();
			System.out.println("�п�J��"+(i+1)+"�Ӿǥͪ��m�W");
			//stuNames[i] = in.nextLine();
			students[i].name = in.nextLine();   // ��ܿ�����O�}�C����i�����O���ܼƵ����ƭ�
			System.out.println("�п�J��"+(i+1)+"�Ӿǥͪ��~��");
			//stuAges[i] = in.nextInt();	
			students[i].age = in.nextInt();		// ��ܿ�����O�}�C����i�����O���ܼƵ����ƭ�
			in.nextLine();						// ����nextInt()�Ҥ�������enter
			System.out.println("�п�J��"+(i+1)+"�Ӿǥͪ��ʧO(M/F)");
			String s = in.nextLine();
			if(s.equalsIgnoreCase("M"))
				//stuSex[i] = true;				
				students[i].sex = true;			// ��ܿ�����O�}�C����i�����O���ܼƵ����ƭ�
			else if(s.equalsIgnoreCase("F"))
				//stuSex[i] = false;
				students[i].sex = false;		// ��ܿ�����O�}�C����i�����O���ܼƵ����ƭ�
		}

		for(int i = 0; i < 3; i++) 
		{
			students[i].printContact();
		}
	}
	
//	public static void printContact(Student[] students)
//	{
//		for(int i = 0; i < students.length; i++)
//		{
//			System.out.printf("%10s", students[i].name);
//			System.out.printf("%5s", students[i].age);
//			System.out.printf("%3s", students[i].sex?"�k��":"�k��");
//			System.out.println();
//		}
//	}
}


class Student
{
	String name;
	int age;
	boolean sex;
	
	public Student(){}     //�إߤ@�ӵL�Ѽƫغc��(�]����A�غc���Ѽƪ��غc����AJAVA�N���|���A�صL�Ѽƪ��غc��)�ҥH�@�w�n�س�!!!
	
	public Student(String name, int age, boolean sex)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void printContact()
	{
			System.out.printf("%10s", name);
			System.out.printf("%5s", age);
			System.out.printf("%3s", sex?"�k��":"�k��");
			System.out.println();
	}
	
}