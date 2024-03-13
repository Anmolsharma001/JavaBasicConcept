import java.util.Scanner;
class lcm
{
    public static void main(String[]args)
    {
        int n1,n2,lcm,hcf,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st num.");
        n1=sc.nextInt();
        System.out.print("enter 2nd num.");
        n2=sc.nextInt();
        hcf=n1;
        temp=n2;
        while(hcf!=temp)
        {
            if(hcf>temp)
                hcf=hcf-temp;
            else
                temp=temp-hcf;
        }
        lcm=(n1*n2)/hcf;
        System.out.print("lcm is"+lcm);
    }
}