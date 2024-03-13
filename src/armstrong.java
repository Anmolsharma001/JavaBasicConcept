import java.util.Scanner;
class armstrong
{
    public static void main(String[]args)
    {
        int num=371,originalNum,temp,result=1;
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