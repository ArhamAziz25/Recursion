public class searcLastAccurence {

    static int search(int arr[],int tofound,int index)
    {
        if(index==0 && arr[index]!=tofound)
        {
            return -1;
        }
        if(arr[index]==tofound)
        {
            return index;
        }
        return search(arr,tofound,index-1);
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,6,7,9};
        int tofound=2;
        System.out.println(search(arr,tofound,arr.length-1));;
        
    }
    
}
