
class fibonacci1
{
    public static void main(String[]args)
    {
        int n=20,fteam=0,steam=1;
        System.out.print("fibonacci terms");
        for(int i=1;i<=n;i++)
        {
            System.out.print(fteam+",");
            int nextTeam=fteam+steam;
            fteam=steam;
            steam=nextTeam;
        }
    }

}