public class FamilyDemo
{
    public static void main(String[] args)
    {
        Couple left = new Couple("bob", "amanda");
        Couple right = new Couple("dennis", "ellie");

        System.out.println("我家左邊住著一對夫妻:"+left);
        System.out.println("我家右邊住著一對夫妻:"+right);

        System.out.println("有天，左邊鄰居生了小寶寶叫做tom");

        Family leftHouse = new Family("bob", "amanda");
        leftHouse.addChild("tom");

        System.out.println("過了一年，左邊鄰居又生了小寶寶叫做mary");
        leftHouse.addChild("mary");

        System.out.println("這是左邊鄰居的全家人");
        System.out.println(leftHouse);
    }
}