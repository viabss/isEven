import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        boolean res;
        String response;
        int number;
        Scanner user_input = new Scanner(System.in);
        try{
            do {
                System.out.print("Please enter a number:");
                number = user_input.nextInt();
                res = isEven(number);
                System.out.println(res);
                System.out.print("Do you want to continue(y/n)?");
                response = user_input.next();
            }while (response.equalsIgnoreCase("Y"));
        } catch (InputMismatchException e) {
            System.out.println("Please enter only Integers");
        }
    }

    public static boolean isEven(int num){
        if(num%2==0)
            return true;
        else
            return false;

    }
}
