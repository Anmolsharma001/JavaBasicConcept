//sumof natrual number
 import java.util.Scanner;
class SumNaturalNumber
{
    public static void main(String[]args)
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter integers");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            System.out.print(sum);
        }
    }
}
