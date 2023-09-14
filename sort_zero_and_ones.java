public class sort_zero_and_ones {
    void print_array(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    int count_zero(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
    void swap_element(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void sorting_with_new_space(int arr[]){
         int ans=count_zero(arr);
        int n=arr.length;
        for(int i=0;i<ans;i++){
            arr[i]=0;
        }
        for(int i=ans;i<n;i++){
            arr[i]=1;
        }
        System.out.println("sorted array is ");
        print_array(arr);
    }
    void sorting_without_new_space(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                swap_element(arr,left,right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        print_array(arr);
    }
    void sort_even_odd(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                swap_element(arr,left,right);
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
        print_array(arr);
    }
    public static void main(String[] args) {
        int []arr={1,0,0,1,1,0,0,0};
        sort_zero_and_ones obj=new sort_zero_and_ones();
//        obj.sorting_with_new_space(arr);
//        obj.sorting_without_new_space(arr);
//        obj.sort_even_odd(arr);
    }
}
