class swapping
{
    public static void main(String[]args)
    {
        int a=23,b=45;
        System.out.println("before swapping");
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}