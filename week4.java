
/**
 * Write a description of class fds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class week4
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Marks: ");
        int marks = scan.nextInt();
        if (marks >= 45)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
        
        
    }
}