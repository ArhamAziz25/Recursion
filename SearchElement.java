public class SearchElement {

    static int search(int arr[],int tofound,int index)
    {
        if(arr[index]==tofound)
        {
            return index;
        }
        if(index==arr.length-1)
        {
            return -1;
        }

        return search(arr,tofound,index+1);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9};
        int tofound=8;
        System.out.println(search(arr,tofound,0));;
        
    }
    
}
