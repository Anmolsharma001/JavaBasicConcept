import java.util.Scanner;
class program
{
    public static void main(String[] args)
    {
     int a,b,sum;
     Scanner input=new Scanner(System.in);
      System.out.print("enter 1st number");
        a=input.nextInt();
        System.out.print("enter 2nd integers");
        b=input.nextInt();
        sum=a+b;
        System.out.print("total is"+sum);
    }
}
