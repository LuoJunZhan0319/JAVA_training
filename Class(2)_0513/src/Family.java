import java.util.ArrayList;
public class Family extends Couple    // 請於此處填入適當程式碼
{
    ArrayList<String> children;

    public Family(String father, String mother)
    {
        super(father, mother);
        children = new ArrayList<String>();   // 請於此處填入適當程式碼
    }

    public void addChild(String name)
    {
        children.add(name);
    }

    public String toString()	// 請於此處填入適當程式碼
    {
    	String result = "";
    	for(int i = 0; i < children.size(); i++ )
    	{
    		result += "child "+(i+1)+":"+children.get(i)+"\n";
    	}
 
    	return result;
    }
}