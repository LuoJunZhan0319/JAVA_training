import java.util.ArrayList;

public class TestStackOfDog 
{
  public static void main(String[] args) 
  {
    StackOfDogs stack = new StackOfDogs();
    createStack(stack);
    
    while (!stack.empty()) // Test if stack is empty
      System.out.println(stack.pop().toString()); // Remove and return from stack
  }
  
  public static void createStack(StackOfDogs stack)
  {
	  Dog amanda = new Dog("amanda", 3, 3, 3);
	  stack.push(amanda);
	  
	  Dog bob = new Dog("bob", 4, 4, 4);
	  stack.push(bob);
	  
	  stack.push(new Dog("carol", 5, 5, 5));
  }
}

class StackOfDogs
{
	ArrayList<Dog> elements;	//產生陣列、用來儲存堆疊所需的存的整數
	int size;		//紀錄堆疊目前的大小
	
	public StackOfDogs()
	{
		elements = new ArrayList<Dog>();
	}
	
	public void push(Dog d)
	{
		elements.add(d);
		size++;
	}
	
	public Dog pop()
	{
		return elements.get(--size);
	}
	
	public Dog peek()
	{
		return elements.get(size-1);
	}
	
	public boolean empty()
	{
		return size == 0;
	}
	
	public int size()
	{
		return size;
	}
	
}