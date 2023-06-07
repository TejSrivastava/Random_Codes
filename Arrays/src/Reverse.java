import java.util.Scanner;
public class Reverse
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=s.length();i>0;i--)
        {
            System.out.println(ch[i]);
        }


    }
}