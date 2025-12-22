
/**
 * Write a description of class fj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ques2
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int num = scan.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd:");
        }
        
        
    }
}