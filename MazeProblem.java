import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazeProblem {

    static ArrayList<String> findPth(int startrow,int startcolumn,int endrow,int endcolumn)
    {
        //Termination case
        if(startcolumn==endcolumn && startrow==endrow)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }

        // Edge case

        if(startcolumn>endcolumn || startrow>endrow)
        {
            ArrayList<String> list=new ArrayList<>();
            return list;
        }

        //Small problem

        ArrayList<String> finalresult=new ArrayList<>();

        ArrayList<String> hmove=findPth(startrow, startcolumn+1, endrow, endcolumn);
        for(String s:hmove)
        {
            finalresult.add("H"+s);
        }
        ArrayList<String> vmove=findPth(startrow+1, startcolumn, endrow, endcolumn);
        for(String s:vmove)
        {
            finalresult.add("V"+s);
        }
        return finalresult;


    } 
    public static void main(String[] args) {
        System.out.println(findPth(0,0,2,2));
    }
    
}
