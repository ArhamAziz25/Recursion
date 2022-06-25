import java.util.ArrayList;

public class Substring {

   static  ArrayList<String> Substr(String str)
{
    //Termination case
    if(str.length()==0)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add(" ");
        return list;

    }

    char FirstChar=str.charAt(0);  // Extracting forst character
    String remainingString=str.substring(1); // extracting remaining string
    ArrayList<String> result =Substr(remainingString); // recursive call
    ArrayList<String> finalresult =new ArrayList<>(); // new Array list
    for(String s:result) // adding new characters
    {
        finalresult.add(s);
        finalresult.add(FirstChar+s);

    }
    return finalresult;

}
    public static void main(String[] args) {
        String str="amit";
     ArrayList<String>result =Substr(str);
     System.out.println(result);
        
    }
    
}
