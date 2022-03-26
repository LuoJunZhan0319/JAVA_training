public class Couple
{
    private String papa;
    private String mama;

    public Couple(String s1, String s2)
    {
        papa = s1;
        mama = s2;
    }

    public String get(boolean getPapa)
    {
       if(getPapa)
          return papa;
       else
          return mama;
    }

    public String toString()
    {
        String answer;

        answer = "father="+papa+"  mother="+mama;

        return answer;
    }
}