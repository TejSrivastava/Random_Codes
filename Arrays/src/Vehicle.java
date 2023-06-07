import java.util.Scanner;
import java.util.Arrays;
public class Vehicle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String []arr=new String[5];
        String []vellore=new String[5];
        String res;
        String []sort=new String[5];
        System.out.println("Enter the vehicle numbers: ");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.next();
            res=arr[i].substring(0,4);
            if(res.equals("TN23"))
            {
                System.out.println("");
                vellore[i]=res;
                //sort[i]=vellore[i].sort();
            }
            else
            {
                System.out.println("");
                System.out.println("Vehicle not from Vellore");
            }
        }
        Arrays.sort(vellore);
        System.out.println("The sortred array : ");
        System.out.println("");
        for(int i=0;i<vellore.length;i++)
        {
            System.out.print(vellore[i]+" ");
        }
    }

}