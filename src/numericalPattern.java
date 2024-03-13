import java.util.Scanner;
class numericalPattern
{
    public static void main(String[]args)
    {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of r:");
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
