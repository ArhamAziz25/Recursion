public class ArraySortedOrNot {

    static boolean ArSort(int arr[],int ind)
    {
        if(ind==arr.length-2)
        {
            return true;
        }
        if(arr[ind]>arr[ind+1])
        {
            return false;
        }

        return ArSort(arr, ind+1);

    }
    public static void main(String[] args) {
        int arr[]={10,11,12,13,14};
        int index=0;
        System.out.println(ArSort(arr,index));
        
    }
    
}
