import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println(n);

    }

    public static class even_odd
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of numbers: ");
            int n=sc.nextInt();
            int []arr=new int[n];
            int []arr_sort=new int[n];
            int c=0;
            System.out.println("Enter the numbers of the array: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2!=0)
                {
                    arr_sort[c]=arr[i];
                    c=c+1;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    arr_sort[c]=arr[i];
                    c=c+1;
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr_sort[i]+" ");
            }
        }

        public static class odd_even
        {
            public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter number of numbers: ");
                int n=sc.nextInt();
                int []arr=new int[n];
                int []arr_sort=new int[n];
                int c=0;
                System.out.println("Enter the numbers of the array: ");
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                for(int i=0;i<n;i++)
                {
                    if(arr[i]%2!=0)
                    {
                        arr_sort[c]=arr[i];
                        c=c+1;
                    }
                }
                for(int i=0;i<n;i++)
                {
                    if(arr[i]%2==0)
                    {
                        arr_sort[c]=arr[i];
                        c=c+1;
                    }
                }
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr_sort[i]+" ");
                }
            }
        }
    }
}
