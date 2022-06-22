public class SearchAllOccurence {

    static String search(int arr[],int tofound,int index,String str)
    {
        if(arr[index]==tofound)
        {
            str=str+" "+index;
        }
        if(index==arr.length-1)
        {
            return str;
        }
        return search(arr,tofound,index+1,str);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,4,5,6,7,2,8,9,2};
        int tofound=2;
        String str="";
        System.out.println(search(arr,tofound,0,str));
    }
    
}
