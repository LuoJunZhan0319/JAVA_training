
public class Transaction {
	
	private String action ;    //���W�٥i�H�H�N
	private int amount ;
	
	//�غc�O�D�n�Ω��ƪ��]�w�C
	public Transaction(String a, int b)  //�S�x1(�P���O�P�W) + �S�x2(�L�^�ǭȫ��A)
	{
		action = a;		//�b����Qnew�X�ӮɡA�غc���N�|�Q����C
		amount = b;	
	}
	
	public void setData(String a, int b)
	{
		action = a;
		amount = b;	
	}
	
	public int getSignedAmount()
	{
		if(action.equals("AC") || action.equals("D") || action.equals("TI"))
			return amount;
    	else
    		return -amount;
		
	}

}
