import java.util.Scanner;
class gcd
{
    public static void main(String[]args)
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        n1=sc.nextInt();
        System.out.print("enter 2nd number");
        n2=sc.nextInt();
        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else
            {
                n2=n2-n1;
            }
            System.out.print("the hcf is"+n1);
        }
    }

}