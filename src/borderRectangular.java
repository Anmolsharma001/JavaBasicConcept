import java.util.Scanner;
class borderRectangular
{
    public static void main(String[]args)
    {
        int r,c;//r is rows and c is columns
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value r and c");
        r=sc.nextInt();
        c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1||i==r||j==1||j==c)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}