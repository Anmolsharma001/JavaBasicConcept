import java.util.Scanner;
class pallindroneORNot
{
    public static void main(String[]args)
    {
        int n,rev=0,z;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        n=sc.nextInt();
        z=n;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(rev==z)
        {
            System.out.print("pallindrone");
        }
        else
        {
            System.out.print("not pallindrone");
        }
    }
}