import java.util.Scanner;
class larger
{
    public static void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the larger number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.print("largest number is:"+max);
    }
}