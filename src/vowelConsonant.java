class vowelConsonant
{
    public static void main(String[]args)
    {
        char ch='e';
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.print(ch+"is a lower case vowel");
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.print(ch+"is a upper case vowel");
        else
            System.out.print(ch+"is a consonant");
    }
}