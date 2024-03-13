import java.util.Scanner;
class add
{
    int a,b;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st value");
        a=sc.nextInt();
        System.out.print("enter the 2nd value");
        b=sc.nextInt();
    }
    void putData()
    {
        System.out.print("total is:"+(a+b));
    }
    public static void main(String[]args)
    {
        add aa=new add();
        aa.getData();
        aa.putData();
    }
}