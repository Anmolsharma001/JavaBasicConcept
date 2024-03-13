import java.util.Scanner;
class wer
{
    public static void main(String[]args)
    {
        int num,originalNum,temp,result=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        num=sc.nextInt();
        originalNum=num;
        while(originalNum!=0)
        {
            temp=originalNum%10;
            result=result+temp*temp*temp;
            originalNum/=10;
        }
        if(result==num)
        {
            System.out.print(num+"is armstrong");
        }
        else
        {
            System.out.print(num+"is not armstrong");
        }
    }
}