import java.util.Scanner;
class decimalToBinary
{
    public static void main(String[]args)
    {
        int decimal_num;
        int parity;
        int ans=0;
        int pw=1;
        Scanner sc=new Scanner(System.in);
        decimal_num=sc.nextInt();
        while(decimal_num>0)
        {
            parity=decimal_num%2;
            ans=ans+(parity*pw);
            decimal_num/=2;
            pw*=10;
        }
        System.out.println(ans);
    }
}
