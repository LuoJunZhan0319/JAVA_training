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
//    int howMany;                // �i�H�ݺަh�֦�
//
//    public int getHowMany() {return howMany;}    // �Ǧ^howMany
//}

//class Labrador extends Dog, SheepDog	//JAVA�n�D�u���~�ӳ�@�����O
//{
//    public void x1(){}
//}

interface SheepDog				//�w�q���� -->�ܼƳ��O�T�w�����A��Y���n����
{
    int howMany = 10;                // �i�H�ݺަh�֦�

    public int getHowMany(); //{return howMany;}    // �Ǧ^howMany  //����������k���w�q�W�١A���঳��k���e
}

class Labrador extends Dog implements SheepDog
{
    public void x1(){}
    
    public int getHowMany()			//�̷Ӥ����w�q�A�ɰ��X�Ӥ����ҫ��w����k�C
    {
    	return 10;
    }
}

