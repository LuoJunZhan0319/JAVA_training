import java.util.ArrayList;
public class Family extends Couple    // �Щ󦹳B��J�A��{���X
{
    ArrayList<String> children;

    public Family(String father, String mother)
    {
        super(father, mother);
        children = new ArrayList<String>();   // �Щ󦹳B��J�A��{���X
    }

    public void addChild(String name)
    {
        children.add(name);
    }

    public String toString()	// �Щ󦹳B��J�A��{���X
    {
    	String result = "";
    	for(int i = 0; i < children.size(); i++ )
    	{
    		result += "child "+(i+1)+":"+children.get(i)+"\n";
    	}
 
    	return result;
    }
}