class Factorial
{
    public static void mian (String[] args)
    {
        int n=5;
        int fact=1;
        for(int i=n; i>=1; i--)
        {
            fact =fact*i;
        }
        System.out.println("the factorial value of 5 is:"+fact);

    }
}