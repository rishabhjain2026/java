import java.util.Scanner;

public class square_of_non_decreasing {
    void sort_absolute(int arr[]){
        int left=0;
        int right=arr.length-1;
        int [] ans=new int[arr.length-1];
        int k=0;
        while(left<right){
            if(Math.abs(left)>Math.abs(right)){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        reverse_array(ans);
    }
    void reverse_array(int ans[]) {
        int i = 0;
        int j = ans.length-1 ;
        while (i < j) {
            //if (ans[i] > ans[j]) {
                swap_element(ans, i, j);
                {
                    i++;
                    j--;
                }

            //print_array(ans);
        }
        print_array(ans);
        //System.out.println("after reversing");
    }

    void swap_element(int ans[], int i, int j) {
        int temp = ans[i];
        ans[i] = ans[j];
        ans[j] = temp;
    }
    void print_array(int ans[]){
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static void main(String[] args) {
       // square_of_non_decreasing obj = new square_of_non_decreasing();
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = Sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        square_of_non_decreasing obj = new square_of_non_decreasing();
        obj.sort_absolute(arr);
    }
}
