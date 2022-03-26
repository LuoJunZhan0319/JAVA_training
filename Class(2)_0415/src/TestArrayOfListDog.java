import java.util.ArrayList;

public class TestArrayOfListDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		
		Dog amanda = new Dog("amanda", 3, 3, 3);
		Dog bob = new Dog("bob", 5, 5, 5);
		Dog carol = new Dog("carol", 7, 7, 7);
		
		list.add(amanda);
		list.add(bob);
		list.add(carol);
		
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getRunIndex());
		}
	}

}
