public class SumOfDigit {
    static int sumdig(int n,int sum)
    {
        //Termination case
        if(n==0)
        {
            return sum;
        }

        //processing logic
        sum=sum+n%10;
        n=n/10;

        //small problem

        return sumdig(n,sum);

    }
    public static void main(String[] args) {
       int x= sumdig(123,0);
       System.out.println(x);
    }
    
}
