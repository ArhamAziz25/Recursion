public class Palindrome {

    static String checkpalindrome(String str)
    {
        if(str.length()==0)
        {
            
            return "";
        }
        char ch=str.charAt(0);
        String remaString=str.substring(1);
        String str2=checkpalindrome(remaString)+ch;
        return str2;
    }
    public static void main(String[] args) {
        String tocheck="namannn";
        String afterpalindrome=checkpalindrome(tocheck);
        if(tocheck.equals(afterpalindrome))
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}
