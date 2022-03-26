public class Mate
{
    private Dog dogMate;
    private Cat catMate;

    public Mate(Dog d, Cat c)
    {
        // 請複製狗狗d，把它的資料複製給dogMate；貓咪的處理類似
    	
    	dogMate = new Dog(d);
    	catMate = new Cat(c);
    	
    	

    }

    public String toString()
    {
        String answer = "";
        
        answer += "狗狗: "+dogMate;
        answer += "跟貓咪: "+catMate+"是好朋友 ";

        return answer;
    }

    public void changeMate(Dog d)
    {
    	dogMate = d;

    }

    public void changeMate(Cat c)
    {
    	catMate = c;
    }
}