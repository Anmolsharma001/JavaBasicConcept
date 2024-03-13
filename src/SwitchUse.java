import java.util.Scanner;
public class SwitchUse
{
    public static void main(String[] args)
    {
        char op;
        double num1,num2,result;
        Scanner input=new Scanner(System.in);
        System.out.println("choose operator");
        op=input.next().charAt(0);
        System.out.println("enter 1st number");
        num1=input.nextDouble();
        System.out.println("enter 2nd number");
        num2=input.nextDouble();
        System.out.println("enter 2nd number");
        num2=input.nextDouble();
        switch(op)
        {
            case'+':
                result=num1+num2;
                System.out.println(num1 +"+"+num2+"="+result);
            case'-':
                result=num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
            case'*':
                result=num1*num2;
                System.out.println(num1+"*"+num2+"="+result);
            case'/':
                result=num1/num2;
                System.out.println(num1+"/"+num2+"="+result);

        }


    }

}

