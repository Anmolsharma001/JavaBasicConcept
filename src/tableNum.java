import java.util.Scanner;
class tableNum
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("table:");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}