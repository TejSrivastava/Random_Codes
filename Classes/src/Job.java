import java.util.*;
class job
{
    String jobid;
    String pos;
    float sal;
    String loc;

    void set(String jobid,String pos,float sal,String loc)
    {
        this.jobid=jobid;
        this.pos=pos;
        this.sal=sal;
        this.loc=loc;
    }
    void display()
    {
        System.out.print(jobid);
        System.out.print(pos);
        System.out.print(sal);
        System.out.print(loc);

    }
    void check()
    {
        if(sal>=30000&&pos.equals("Software Developer")){
            System.out.println("Job criteria is matched");
        }
        else{
            System.out.println("Job criteria is not matched");
        }
    }
}
public class Job{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String jobid=sc.nextLine();
        String pos=sc.nextLine();
        float sal=sc.nextFloat();
        String loc=sc.nextLine();
        job obj=new job();
        obj.display();
        obj.check();
    }
}