public class ReverseString {
    static String rev(String str)
    {
        if(str.length()==1)
        {
            return String.valueOf(str.charAt(0));
        }
        String smallstr=str.substring(1);
        Character ch=str.charAt(0);
        return rev(smallstr)+ch;
    

    }
    public static void main(String[] args) {
        System.out.println(rev("abcd"));
        
    }
    
}
