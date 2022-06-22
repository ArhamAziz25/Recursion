public class powerOfDigit {
    static int pow(int num,int pw)
    {
        if(pw==0)
        {
            return 1;
        }
        return pow(2,pw-1)*num;

    }
    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
    
}
