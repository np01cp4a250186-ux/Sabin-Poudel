package week12;
import java.util.ArrayList;
public class StudentApp
{
    public static void main(String []args)
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("kshitiz", "L1N1", "9846921170"));
        list.add(new Student("suraj", "L1M1", "98975337809"));
        list.add(new Student("sabin", "L1N2", "9876543212"));
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.println(list.get(i));
        }
        list.remove(2);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.add(0, new Student("Sabin", "L1C1", "9879543212"));
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.get(2).setGroup("L1N2");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.get(1).setName("kshitiz");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
