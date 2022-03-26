public class Lab11_16b
{
    public static void main(String[] args)
    {
        Dog amanda = new Dog();
        Labrador bob = new Labrador();
        SheepDog carol;							//宣告一個變數carol，裡面只能裝著具備SheepDog特性的物件
        //SheepDog carol = new SheepDog();		//介面不是類別，無法產生物件。

        if(amanda instanceof Dog)
           System.out.println("amanda 是個 Dog");
        else
           System.out.println("amanda 不是個 Dog");

        if(amanda instanceof Labrador)
           System.out.println("amanda 是個 拉拉");
        else
           System.out.println("amanda 不是個 拉拉");

        if(amanda instanceof SheepDog)
           System.out.println("amanda 是個 牧羊犬");
        else
           System.out.println("amanda 不是個 牧羊犬");

        if(bob instanceof Dog)
           System.out.println("bob 是個 Dog");
        else
           System.out.println("bob 不是個 Dog");

        if(bob instanceof Labrador)
           System.out.println("bob 是個 拉拉");
        else
           System.out.println("bob 不是個 拉拉");

        if(bob instanceof SheepDog)
           System.out.println("bob 是個 牧羊犬");
        else
           System.out.println("bob 不是個 牧羊犬");

        System.out.println(SheepDog.howMany);        // 這就是interface定義欄位的static特性
        //SheepDog.howMany = 20;                    // 這就是interface定義欄位的final特性
    }
}

class Dog
{
    int tailLength;
}

interface SheepDog
{
    int howMany = 10;                // interface的欄位變數只能是final & static

    //public int getHowMany();    // 傳回howMany
}

class Labrador extends Dog implements SheepDog
{
    public void x1(){}
}
