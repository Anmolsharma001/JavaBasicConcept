import java.util.Scanner;
class swap
{
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("enter the num a & b");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("before swapping"+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.print("after swapping"+a+" "+b);
    }
}