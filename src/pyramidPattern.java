import java.util.Scanner;
class pyramidPattern
{
    public static void main(String[]args)
    {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of r");
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-i;j++)//space count karke print karenga...
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)//stars printing karengaa....
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}