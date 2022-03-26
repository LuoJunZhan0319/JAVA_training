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
			System.out.println("請輸入第"+(i+1)+"個學生的姓名");
			//stuNames[i] = in.nextLine();
			students[i].name = in.nextLine();   // 表示選擇類別陣列中第i個類別的變數給予數值
			System.out.println("請輸入第"+(i+1)+"個學生的年齡");
			//stuAges[i] = in.nextInt();	
			students[i].age = in.nextInt();		// 表示選擇類別陣列中第i個類別的變數給予數值
			in.nextLine();						// 接收nextInt()所不接收的enter
			System.out.println("請輸入第"+(i+1)+"個學生的性別(M/F)");
			String s = in.nextLine();
			if(s.equalsIgnoreCase("M"))
				//stuSex[i] = true;				
				students[i].sex = true;			// 表示選擇類別陣列中第i個類別的變數給予數值
			else if(s.equalsIgnoreCase("F"))
				//stuSex[i] = false;
				students[i].sex = false;		// 表示選擇類別陣列中第i個類別的變數給予數值
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
//			System.out.printf("%3s", students[i].sex?"男生":"女生");
//			System.out.println();
//		}
//	}
}


class Student
{
	String name;
	int age;
	boolean sex;
	
	public Student(){}     //建立一個無參數建構式(因為當你建構有參數的建構式後，JAVA就不會幫你建無參數的建構式)所以一定要建喔!!!
	
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
			System.out.printf("%3s", sex?"男生":"女生");
			System.out.println();
	}
	
}