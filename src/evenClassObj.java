import java.util.Scanner;
class evenClassObj
{
    int num;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        num=sc.nextInt();
    }
    void putData()
    {
        if(num%2==0)
        {
            System.out.print("Even number");
        }
        else
        {
            System.out.print("odd number");
        }
    }
    public static void main(String[]args)
    {
        evenClassObj aa=new evenClassObj();
        aa.getData();
        aa.putData();
    }
}
