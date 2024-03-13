import java.util.Scanner;
class factorial
{
    public static void main(String[]args)
    {
        int n;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter integers");
        n=sc.nextInt();
        if(n<0)
        {
            System.out.print("it does not negative number");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.print("factorial"+n+"="+fact);
        }
    }
}
