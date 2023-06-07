class Car {
    String name;
    String color;
    protected int mileage;
    void set(String name1,String color,int mileage){
        this.color=color;
        name=name1;
        this.mileage=mileage;
    }
    void drive()
    {
        int local;
        System.out.println("I can drive");
    }
    void reverse()
    {
        System.out.println("I can take reverse");
    }
    void display()
    {
        System.out.println("Name " +name+ " Color " +color+ " Mileage " +mileage);
    }
}

public class Cardemo{
    public static void main(String[] args){
        Car Ford=new Car();
        //Ford.name="Ecosport";
        //Ford.color="Black";
        //Ford.mileage=20;
        Ford.set("Ford","White",20);
        Ford.drive();
        Ford.reverse();
        Ford.display();

    }
}
