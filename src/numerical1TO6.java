import java.util.Scanner;
class numerical1TO6
{
    public static void main(String[]args)
    {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of r:");
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}