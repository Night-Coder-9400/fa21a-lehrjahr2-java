public class Main
{
    public static void main(String[] args)
    {
        System.out.println("MyNumber:" + "\n");

        MyNumber myNumber = new MyNumber(42, "Answer to the Ultimate Question of Life, The Universe, and Everything", true);
        System.out.println(myNumber.toString());
        myNumber.clearComment();
        myNumber.resetFlag();

        System.out.println("------------");

        System.out.println(myNumber.toString());

        System.out.println("\n------------");
        System.out.println("MyChar:" + "\n");

        MyChar myChar = new MyChar('A', "This is working", true);
        System.out.println(myChar.toString());
        myChar.clearComment();
        myChar.resetFlag();

        System.out.println("------------");

        System.out.println(myChar.toString());
    }
}