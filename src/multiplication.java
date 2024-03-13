import java.util.Scanner;
class Multiplication
{
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number");
        a=input.nextInt();
        System.out.println("enter 2nd number");
        b=input.nextInt();
        c=a*b;
        System.out.println("total is"+c);
    }
}
