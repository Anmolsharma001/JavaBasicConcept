import java.util.Scanner;
class largestnumber
{
    public static void main(String[]args)
    {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter three different number");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1>=n2 && n1>=n3)
            System.out.print("largset value is:"+n1);
        else if(n2>=n1 && n2>=n3)
            System.out.print("largset value is:"+n2);
        else
            System.out.print("largest value is:"+n3);

    }
}