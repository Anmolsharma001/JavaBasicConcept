import java.util.Scanner;
class power
{
    public static void main(String[]args)
    {
        int x,y,prod=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base");
        x=sc.nextInt();
        System.out.print("enter the power");
        y=sc.nextInt();
        while(y>0)
        {
            prod=prod*x;
            y--;
        }
        System.out.print("the answer is"+prod);

    }
}