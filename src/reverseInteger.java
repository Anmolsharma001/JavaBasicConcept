import java.util.Scanner;
class reverseInteger
{
    public static void main(String[]args)
    {
        int n,remainder,reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        n=sc.nextInt();
        while(n!=0)
        {
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.print("reverse is"+reverse);
    }

}