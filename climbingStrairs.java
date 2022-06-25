import java.util.ArrayList;

public class climbingStrairs {

    static ArrayList<String> climb(int top,int start)
    {
        
        if(start==top)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }

        if(start>top)
        {
            ArrayList<String> list=new ArrayList<>();
            return list;
        }

        ArrayList<String> finalresult=new ArrayList<>();
        ArrayList<String> OneStep=climb(top,start+1);
        for(String s:OneStep)
        {
            finalresult.add("1"+s);
        }
        ArrayList<String> twoStep=climb(top, start+2);
        for (String s : twoStep) {
            finalresult.add("2"+s);
            
        }
        return finalresult;

    }
    public static void main(String[] args) {
        System.out.println(climb(5,0));
    }
    
}
