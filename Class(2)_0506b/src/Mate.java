public class Mate
{
    private Dog dogMate;
    private Cat catMate;

    public Mate(Dog d, Cat c)
    {
        // �нƻs����d�A�⥦����ƽƻs��dogMate�F�߫}���B�z����
    	
    	dogMate = new Dog(d);
    	catMate = new Cat(c);
    	
    	

    }

    public String toString()
    {
        String answer = "";
        
        answer += "����: "+dogMate;
        answer += "��߫}: "+catMate+"�O�n�B�� ";

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