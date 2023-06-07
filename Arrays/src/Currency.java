import java.util.Scanner;
public class    Currency
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        do
        {
            System.out.println("Enter Country: ");
            String c=in.next();
            switch(c)
            {
                case "India":System.out.print("Rupee");
                    break;
                case "US":System.out.println("Dollar ");
                    break;
                case "China":System.out.println("Yuan ");
                    break;
                case "Russia":System.out.println("Ruble");
                    break;
                case "UK":System.out.println("Pound Sterling");
                    break;
                case "France":System.out.println("Euro");
                    break;
                default: System.out.println("Your Country name is invalid ");
                    break;
            }
            System.out.println("Do you want to continue?");
            System.out.println("Enter Y/N ");
            String ch=in.next();
            if(ch.equals("N"))
            {
                System.out.println("Bye");
                break;
            }
        }
        while(ch.equals("Y"));
    }
}
