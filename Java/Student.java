import java.util.*;
import java.util.Scanner;
class Student
{
    int rno,per;
    String name;

    Student()
    {
        rno=01;
        name="Nizam";
        per=89;
    }

    Student(int rno,String name,int per)
    {
        this.rno=rno;
        this.name=name;
        this.per=per;
    }

    void Dis()
    {
        System.out.print("Roll no:"+rno );
        System.out.print("NAme :"+name );
        System.out.print("Percentage:"+per+"\n");
    }

    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        Student obj[]=new Student[10];
        
        System.out.print("ENter How Many Details u Wanr:");
        int n=s.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.err.print("Enter Roll no:");
            int rno=s.nextInt();

            System.err.print("Enter Name:");
            String name=s.next();
            System.err.print("Enter Percentage:");
            int per=s.nextInt();
            obj[i]=new Student(rno,name,per);
        }

        for(int i=0;i<n;i++)
        {
            obj[i].Dis();
        }
        Student st= new Student();
    }
}