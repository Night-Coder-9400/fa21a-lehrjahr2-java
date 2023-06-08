import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) throws CheckPush, CheckPop {
        IntergerStack stack = new IntergerStack();


        for(int i = 0; i < 11; i++)
        {
            System.out.println(stack.push(42));
        }

        //System.out.println(stack.empty());
        System.out.println(stack.pop());
    }
}