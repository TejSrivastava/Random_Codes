import java.util.Scanner;
class mob1 {
    String Name;
    float ram;
    float price;
    String color;

    mob1()
    {
        Name="SAMSUNG GALAXY J6";
        ram=64;
        price=15000;
        color="BLACK";
    }

    void setinput(String Name1,float ram,float price,String color){
        Name=Name1;
        this.ram=ram;
        this.price=price;
        this.color=color;
    }

    void display()
    {
        System.out.println(Name);
        System.out.println(ram);
        System.out.println(color);
        System.out.println(price);
    }
}

public class mob{
    public static void main(String[] args){
        mob[] obj=new mob[3];
        obj[0]=new mob();
        obj[1]=new mob();
        obj[2]=new mob();

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



