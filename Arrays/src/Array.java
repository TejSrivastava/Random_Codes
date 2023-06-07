import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=in.nextInt();
        int []arr=new int[n];
        int sum=0,prod=1;
        System.out.println("Enter the elements of the array: ");
        for(int i=1;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum=sum+arr[i];
            prod=prod*arr[i];
        }
        System.out.println("The sum of the elements of is:"+sum);
        System.out.println("The product of the elements is:" +prod);
    }
}
