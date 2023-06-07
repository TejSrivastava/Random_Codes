import java.util.Scanner;
public class India
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen=sc.next();
        int count=0,count_SCOPE=0,count_SITE=0;
        if(sen.contains("India"))
        {
            count++;
        }
        System.out.println(count);
        String[] microsoft_selection =new String[3];
        System.out.println("Enter the registration numbers: ");
        for(int i=0;i<=2;i++)
        {
            microsoft_selection[i]=sc.next();
            if((microsoft_selection[i].substring(2,4)).contains("BCE"))
            {
                count_SCOPE++;
                System.out.println("SCOPE numbers are: ");
                System.out.println(microsoft_selection[i]);
            }
            if((microsoft_selection[i].substring(2,4)).contains("BIT"))
            {
                count_SITE++;
                System.out.println("SITE numbers are: ");
                System.out.println(microsoft_selection[i]);
            }
        }
    }
}
