public class towerofhanoi {


    static void printinstructionforme(int n,char from,char helper, char to)
    {
        if(n==0)
        {
            return ;
        }

        printinstructionforme(n-1, from, to, helper);
        System.out.println("Move disk "+n+" from "+from+" to "+to);
        printinstructionforme(n-1, helper, from, to);

    }

    public static void main(String[] args) {
        printinstructionforme(3,'A','C','B');

        
    }
    
}
