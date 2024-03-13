import java.util.Scanner;
class pattern01
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.println("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
        }
    }
}