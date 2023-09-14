public class binary_search {
    boolean find_index(int []arr,int target){
        int n=arr.length-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return true;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    boolean recursion_binary_search(int []arr,int target,int start,int end){
        if(start>end) {
            return false;
        }
        int mid=(start+end)/2;
        if(target==arr[mid]){
            return true;
        }
        if(target<arr[mid]){
            return(recursion_binary_search(arr,target,start,mid-1));
        }
        else{
            return(recursion_binary_search(arr,target,mid+1,end));
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int target=5;
        binary_search obj=new binary_search();
        //System.out.println(obj.find_index(arr,target));
        System.out.println(obj.recursion_binary_search(arr,target,0,arr.length-1));
    }
}
