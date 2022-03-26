 
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
	
	int[] elements;	//���Ͱ}�C�B�Ψ��x�s���|�һݪ��s�����
	int size;		//�������|�ثe���j�p
	
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
//			return true;  //�Y���|����,�^��true	
//		}
//		return false;
		//��n���g�k
		return size == 0; //�Y���|����,�^��true
	}
	public int peek()
	{
		return elements[size-1]; //size-1��ܰ}�C�̥��ݪ�����
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
		//���ݭn�S�O���Ӧ�l���ƭȴ���
		//�u�ݭn�ǥ�size�j�p�ө���ƴN�n
		//�N����size�b�S����J�Ʀr�O���|�W�[��
		//�ҥH��l��l���Ʀr���z���A����push�Ʀr�]�|�ﱼ��l��!!
		
		return elements[--size];
	}
	
	public int getsize()
	{
		return size;
	}
	
}