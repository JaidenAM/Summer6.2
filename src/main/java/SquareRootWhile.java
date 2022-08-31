import java.util.Scanner;
import static java.lang.Math.sqrt;

public class SquareRootWhile {
    public static void main(String args[])
    {
        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        while (number != -1){
            System.out.println("Invalid Number: " + number);
            System.out.println("The square root of " + number + " is " + sqrt(number));
        }
    }

}
