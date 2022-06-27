import java.util.ArrayList;

public class phonenumber {

    static String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String> getanswer(String digits)
    {
        if(digits.length()==0)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }

        char firstcharacter=digits.charAt(0); //2 ---------------------------->3
        String remstring=digits.substring(1); //3 ----------------------->""
        int digit=firstcharacter-'0';  //2 ----------------------------->3
        String strkey=keys[digit];  //abc ----------------------------->def
        ArrayList<String> finalresult=new ArrayList<>();
        for(int i=0;i<strkey.length();i++) //3
        {
            ArrayList<String> result=getanswer(remstring); //
            for(String s:result)
            {
                finalresult.add(strkey.charAt(i)+s);

            }
        }
        return finalresult;


    }


    public static void main(String[] args) {
        System.out.println(getanswer("0"));
        
    }
    
}
