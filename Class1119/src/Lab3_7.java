public class Lab3_7
{
   public static void main(String[] args)
   {
        int a = 10, b = 0, c = 30;
        a = 30;

        // demo the matching of else with if

        if(a > b)
        //下面四行才是一組的!!
           if(b > 10)
              System.out.println("b > 10");
        else
           System.out.println("Here comes a trap.");
        
        System.out.println("bye bye");
   }
}