import java.util.Scanner;
class subtraction
{
    public static void main(String[]args)
    {
        int a,b,sub;
     Scanner sc=new Scanner(System.in);
     System.out.print("enter 1st number");
     a=sc.nextInt();
     System.out.print("enter 2st number");
     b=sc.nextInt();
     sub=a-b;
     System.out.print("total is "+sub);
    }
}