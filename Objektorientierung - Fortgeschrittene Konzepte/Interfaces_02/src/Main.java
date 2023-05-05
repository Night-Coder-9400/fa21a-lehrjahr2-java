import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        ArrayStack stack = new ArrayStack(3);

        //Test push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Test pop
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //Test peek
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());

        //Test empty
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.empty();
        System.out.println(stack.peek());

        //Test clear
        stack.clear();
        System.out.println(stack.peek());
    }
}