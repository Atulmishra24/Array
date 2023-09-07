public class binomialExpression{
   
    public static int fact(int n)
    {
        int fact = 1;
        for(int i =1 ; i<= n ; i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    // nCr= n!/r!*(n-r)!
    public static int binomial(int n,int r){


        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact= fact(n-r);

        int binomialExpress = ((n_fact)/(r_fact*nmr_fact));

        return binomialExpress;
    }
    public static void main(String[] args) {
        

        int result = binomial(5,2);
         System.out.println(result);
    }
}