public class Inclass5
{
    public static void main(String[] args)
    {
         //char c = 'M';
         //System.out.println(c);

         String s = "abcde";
         char c1 = s.charAt(4);
         char c2 = s.charAt(3);
         char c3 = s.charAt(2);
         char c4 = s.charAt(1);
         char c5 = s.charAt(0);
         
         System.out.print(s.charAt(4));
         System.out.print(s.charAt(3));
         System.out.print(s.charAt(2));
         System.out.print(s.charAt(1));
         System.out.print(s.charAt(0));
         
         for(int i=1; i<12; i++)
         {
        	 if(i%2 != 0)
        		 System.out.println(i);
         }
    }
}