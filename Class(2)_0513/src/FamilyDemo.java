public class FamilyDemo
{
    public static void main(String[] args)
    {
        Couple left = new Couple("bob", "amanda");
        Couple right = new Couple("dennis", "ellie");

        System.out.println("�ڮa�����ۤ@��ҩd:"+left);
        System.out.println("�ڮa�k���ۤ@��ҩd:"+right);

        System.out.println("���ѡA����F�~�ͤF�p�_�_�s��tom");

        Family leftHouse = new Family("bob", "amanda");
        leftHouse.addChild("tom");

        System.out.println("�L�F�@�~�A����F�~�S�ͤF�p�_�_�s��mary");
        leftHouse.addChild("mary");

        System.out.println("�o�O����F�~�����a�H");
        System.out.println(leftHouse);
    }
}