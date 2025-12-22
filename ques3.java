
/**
 * Write a description of class r here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ques3
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        if (num > 0)
        {
            System.out.println("Number is Positive");
        }
        else if (num < 0)
        {
            System.out.println("Number is Negative");
            
        }
        else
        {
            System.out.println("Number is Zero");
        }
        
    }
}