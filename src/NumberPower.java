class NumberPower
{
    public static void main(String[]args)
    {
        int base=3,exponent=2;
        long result=1;
        while(exponent!=0)
        {
            result=result*base;
            --exponent;
        }
        System.out.print("Answer is"+result);
    }
}