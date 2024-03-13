import java.util.Scanner;
class binaryToDecimal
{
    public static void main(String[]args)
    {
        int binary_Num;
        int unit_digit;
        int ans=0;
        int pw=1;
        Scanner sc=new Scanner(System.in);
        binary_Num=sc.nextInt();
        while(binary_Num>0)
        {
            unit_digit=binary_Num%10;
            ans=ans+(unit_digit*pw);
            binary_Num/=10;
            pw*=2;
        }
        System.out.println(ans);
    }

}