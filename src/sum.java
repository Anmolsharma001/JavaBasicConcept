import java.util.Scanner;
class sum
{
    public static void main(String[]args)
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the natural num.");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
