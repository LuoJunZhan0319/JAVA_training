
public class Transaction {
	
	private String action ;    //欄位名稱可以隨意
	private int amount ;
	
	//建構是主要用於資料的設定。
	public Transaction(String a, int b)  //特徵1(與類別同名) + 特徵2(無回傳值型態)
	{
		action = a;		//在物件被new出來時，建構式就會被執行。
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
