class primenumber
{
    public static void main(String[]args)
    {
        int n=7;
        boolean flag=false;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
            if(!flag)
            {
                System.out.print(n+"is prime");
            }
            else
            {
                System.out.print(n+"is not prime ");
            }
        }
    }
}