import java.util.ArrayList;

public class DiceGame {

    static ArrayList<String> reachToten(int currentValue,int endvalue)
    {
        if(currentValue==endvalue)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }

        if(currentValue>endvalue)
        {
            ArrayList<String> list=new ArrayList<>();
            return list;
        
        }
        ArrayList<String> finalResult=new ArrayList<>();
        for(int dice=1;dice<6;dice++)
        {
            int newValue=currentValue+dice;
            ArrayList<String> result=reachToten(newValue, endvalue);
            for(String s:result)
            {
                finalResult.add(s+dice);

            }

        }
        return finalResult;

    }
    public static void main(String[] args) {

        System.out.println(reachToten(0,10));

    }

    
}
