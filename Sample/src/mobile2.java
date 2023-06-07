import java.util.Scanner;

class mobile
{
    String name;
    String color;
    float ram;
    double price;

    mobile()
    {
        name="SAMSUNG GALAXY J6";
        color="BLUE";
        ram=64;
        price=112456.98;
    }

    void setinput(String name,String color,float ram,double price)
    {
        this.name=name;
        this.color=color;
        this.ram=ram;
        this.price=price;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(color);
        System.out.println(ram);
        System.out.println(price);
    }
}
public class mobile2{
    public static void main(String[] args)
    {
        mobile[] obj=new mobile[3];
        obj[0]=new mobile();
        obj[1]=new mobile();
        obj[2]=new mobile();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<obj.length;i++)
        {
            System.out.println("Enter the name: ");
            String name=sc.next();
            System.out.println("Enter the color: ");
            String color=sc.next();
            System.out.println("Enter the ram: ");
            float ram=sc.nextFloat();
            System.out.println("Enter the price: ");
            double price=sc.nextDouble();
            obj[i].setinput(name,color,ram,price);

        }
        obj[0].display();
        obj[1].display();
        obj[2].display();
    }
}
