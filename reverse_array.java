import java.util.Scanner;
public class reverse_array {
    void reverse_array(int arr[]) {
        int n = arr.length;
        int j = 0;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        System.out.println("after reversing");
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

    void reverse_array2(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap_element(arr, i, j);
            {
                i++;
                j--;
            }
        }
        System.out.println("after reversing");
    }

    void swap_element(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        reverse_array obj = new reverse_array();
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = Sc.nextInt();
        System.out.println("enter the element");
        int[] arr = new int[n];
        //int []ans=new ans[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        //obj.reverse_array(arr);
        obj.reverse_array2(arr);
        System.out.println("after reversing");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
