public class Main {
    public static void main(String[] args)
    {
        IntergerStack stack = new IntergerStack();


        for(int i = 0; i < 11; i++)
        {
            System.out.println(stack.push(42));
        }

        //System.out.println(stack.empty());

    }
}