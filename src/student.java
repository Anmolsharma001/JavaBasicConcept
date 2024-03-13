class student//class object me static ka use kese hota h?
{
    int roll;
    String name;
    static String cname="MITM";
    student(int x,String y)
    {
        roll=x;
        name=y;
    }
    void display()
    {
        System.out.println("roll="+roll+","+"name="+name+","+"college name="+cname);
    }
}
class demo
{
    public static void main(String[]args)
    {
        student aa=new student(101,"siddhi");
        student bb=new student(102,"rashmi");
        aa.display();
        bb.display();
    }
}