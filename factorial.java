class factorial
{

    static int fact(int n,int fac)
    {
        if(n==1)
        {
            return fac;
        }else{

        fac=fac*n;
        return fact(n-1,fac);}

    }
    public static void main(String[] args) {
        System.out.println(fact(5,1)); 
        
    }
}