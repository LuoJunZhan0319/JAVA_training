 
public class TestStackOfIntegers 
{
  public static void main(String[] args) 
  {
    StackOfIntegers stack = new StackOfIntegers();
    
    for (int i = 0; i < 10; i++)
      stack.push(i); // Push i to the stack
    
    while (!stack.empty()) // Test if stack is empty
      System.out.print(stack.pop() + " "); // Remove and return from stack
  
  }
  
}

class StackOfIntegers
{
	
	int[] elements;	//產生陣列、用來儲存堆疊所需的存的整數
	int size;		//紀錄堆疊目前的大小
	
	public StackOfIntegers()
	{
		//elements = new int[16];
		this(16);
	}
	
	public StackOfIntegers(int capacity)
	{
		elements = new int[capacity];
	}
	
	public boolean empty()
	{
//		if(size == 0)
//		{
//			return true;  //若堆疊為空,回傳true	
//		}
//		return false;
		//更好的寫法
		return size == 0; //若堆疊為空,回傳true
	}
	public int peek()
	{
		return elements[size-1]; //size-1表示陣列最末端的元素
	}
	
	public void push(int value)
	{
		elements[size++] = value;
	}
	
	public int pop()
	{
//		int temp = elements[--size];
//		elements[size] = 0;
//		return temp;
		//不需要特別把原來位子的數值換掉
		//只需要藉由size大小來抽取數就好
		//意味者size在沒有填入數字是不會增加的
		//所以原始位子的數字不理它，之後push數字也會改掉原始數!!
		
		return elements[--size];
	}
	
	public int getsize()
	{
		return size;
	}
	
}