import java.util.Scanner;
class prime
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        n=sc.nextInt();
    }
    void putData()
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not prime");
        }
    }
    public static void main(String[]args)
    {
        prime aa=new prime();
        aa.getData();
        aa.putData();
    }
}