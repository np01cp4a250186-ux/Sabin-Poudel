
/**
 * Write a description of class l here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ques5
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num  = scan.nextInt();
        if(num % 3==0 && num % 5==0)
        {
            System.out.println("It is Divisible By both 3 and 5");
            
        }
        else
        {
            System.out.println("It is Not Divisible By both 3 and 5");
        }
    }
}