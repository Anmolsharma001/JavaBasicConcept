import java.util.Scanner;
class reversePyramid
{
    public static void main(String[]args)
    {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value");
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=r;k++)
            {
                System.out.print(" "+"%");
            }
            System.out.println();
        }
    }
}