import java.util.Scanner;
class Even
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter an integr");
        int num=input.nextInt();
        if(num%2==0)
        {
            System.out.print(num+"is even");
        }
        else
        {
            System.out.println(num+"is odd");
        }
    }
}
