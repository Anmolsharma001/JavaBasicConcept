public class inheritanceTopic
{
    public void makeNoise()
    {
        System.out.print("Animal making noise");
    }
    public void eat()
    {
        System.out.print("animal is eating");
    }
    public void walk()
    {
        System.out.print("animal is walking");
    }
}
class dog extends inheritanceTopic
{
    public void makeNoise()
    {
        System.out.print("barking");
    }
}
class cat extends inheritanceTopic
{
    public void makeNoise()
    {
        System.out.print("meaw");
    }
}
class Tiger extends inheritanceTopic
{
    public void makeNoise()
    {
        System.out.print("roaring");
    }
}
