import java.util.Scanner;
class oppositeTriangle
{
    public static void main(String[]args)
    {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the r value");
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(r-i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}