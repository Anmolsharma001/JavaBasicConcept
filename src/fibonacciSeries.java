import java.util.Scanner;//input wala
class fibonacciSeries
{
    public static void main(String[]args)
    {
        int n,fteam=0,steam=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("fibonacci series");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(fteam+",");
            int nextTeam=fteam+steam;
            fteam=steam;
            steam=nextTeam;
        }
    }
}