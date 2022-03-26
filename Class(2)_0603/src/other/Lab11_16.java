package other;
public class Lab11_16
{
}

class Dog
{
    int tailLength;
}

//class SheepDog
//{
//    int howMany;                // 可以看管多少羊
//
//    public int getHowMany() {return howMany;}    // 傳回howMany
//}

//class Labrador extends Dog, SheepDog	//JAVA要求只能繼承單一父類別
//{
//    public void x1(){}
//}

interface SheepDog				//定義介面 -->變數都是固定死的，亦即都要給值
{
    int howMany = 10;                // 可以看管多少羊

    public int getHowMany(); //{return howMany;}    // 傳回howMany  //介面中的方法指定義名稱，不能有方法內容
}

class Labrador extends Dog implements SheepDog
{
    public void x1(){}
    
    public int getHowMany()			//依照介面定義，時做出該介面所指定的方法。
    {
    	return 10;
    }
}

