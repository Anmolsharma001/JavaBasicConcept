import java.util.Scanner;
class rectangular
{
    public static void main(String[]args)
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value");
        r=sc.nextInt();
        c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}