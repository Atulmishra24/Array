public class factoreial
{
    public static int fact(int n)
    {
        int fact = 1;
        for(int i =1 ; i<= n ; i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) 
    {
        int result = fact(4);
        System.out.println("THe Factorial of number is : "+ result);         
    }
}