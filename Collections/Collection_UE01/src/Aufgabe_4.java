import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Aufgabe_4
{
    public static void klammerChecker(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Klammern ein: ");
        String input = scanner.next();

        System.out.println(Arrays.toString(input.toCharArray()));

        boolean istKorrekt = checkKlammern(input);;
        if(istKorrekt)
        {
            System.out.println("OK!");
        }
        else
        {
            System.out.println("NOK");
        }
    }

    private static boolean checkKlammern(String input){
        Stack<Character> check = new Stack<>();
        for (char c: input.toCharArray()){
            if(c == '('){
                check.push(c);
            }
            else if(c == ')'){
                if(check.isEmpty()){
                    return false;
                }
                else{
                    check.pop();
                }
            }
        }
        return check.isEmpty();
    }
}
