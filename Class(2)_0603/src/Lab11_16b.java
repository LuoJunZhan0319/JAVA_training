public class Lab11_16b
{
    public static void main(String[] args)
    {
        Dog amanda = new Dog();
        Labrador bob = new Labrador();
        SheepDog carol;							//�ŧi�@���ܼ�carol�A�̭��u��˵ۨ��SheepDog�S�ʪ�����
        //SheepDog carol = new SheepDog();		//�������O���O�A�L�k���ͪ���C

        if(amanda instanceof Dog)
           System.out.println("amanda �O�� Dog");
        else
           System.out.println("amanda ���O�� Dog");

        if(amanda instanceof Labrador)
           System.out.println("amanda �O�� �ԩ�");
        else
           System.out.println("amanda ���O�� �ԩ�");

        if(amanda instanceof SheepDog)
           System.out.println("amanda �O�� ���Ϥ�");
        else
           System.out.println("amanda ���O�� ���Ϥ�");

        if(bob instanceof Dog)
           System.out.println("bob �O�� Dog");
        else
           System.out.println("bob ���O�� Dog");

        if(bob instanceof Labrador)
           System.out.println("bob �O�� �ԩ�");
        else
           System.out.println("bob ���O�� �ԩ�");

        if(bob instanceof SheepDog)
           System.out.println("bob �O�� ���Ϥ�");
        else
           System.out.println("bob ���O�� ���Ϥ�");

        System.out.println(SheepDog.howMany);        // �o�N�Ointerface�w�q��쪺static�S��
        //SheepDog.howMany = 20;                    // �o�N�Ointerface�w�q��쪺final�S��
    }
}

class Dog
{
    int tailLength;
}

interface SheepDog
{
    int howMany = 10;                // interface������ܼƥu��Ofinal & static

    //public int getHowMany();    // �Ǧ^howMany
}

class Labrador extends Dog implements SheepDog
{
    public void x1(){}
}
