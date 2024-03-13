class numberCounting
{
    public static void main(String[]args)
    {
        int count=0,num=342156;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.print("the value is:"+count);
    }
}