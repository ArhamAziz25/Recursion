public class NumOfZeroes {

    static int numx(int num,int count)
    {
        int rem=num%10;
        if(num==0)
        {
            return count;
        }
        if(rem==0)
        {
            count++;
        }
        num=num/10;
        return numx(num, count);
    }
    public static void main(String[] args) {
        System.out.println(numx(100290030, 0));
        
    }
    
}
