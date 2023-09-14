import java.util.Scanner;
public class prefix_sum {
    void prefix_sum1(int arr[]) {
        //int prefix[0]=arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        print_array(arr);
    }

    void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void quiery(int arr[], int l, int r) {
        int sum = 0;
        sum = arr[r] - arr[l];
        System.out.println("sum of value in given range is");
        System.out.println(sum);
    }

    static int find_total_sum(int arr[]) {
        int total_sum = 0;
        for (int i =0; i < arr.length; i++) {
            total_sum += arr[i];
        }
        return total_sum;
    }

    static boolean partition_prefix_sum_and_suffix_sum(int arr[]) {
        int total_sum = find_total_sum(arr);
        int prefix_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];
            int suffix_sum = total_sum - prefix_sum;
            if (suffix_sum == prefix_sum) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        //int []arr=new int[n];
        prefix_sum obj = new prefix_sum();
        //obj.prefix_sum1(arr);
        Scanner Sc = new Scanner(System.in);
//        System.out.println("enter number of quries");
//        int q = Sc.nextInt();
//        while (q-- > 0) {
//            System.out.println("enter starting index of l");
//            int l = Sc.nextInt();
//            System.out.println("enter end index of r");
//            int r = Sc.nextInt();
//
//            obj.prefix_sum1(arr);
//            obj.quiery(arr, l, r);
//        }
       // System.out.println(obj.partition_prefix_sum_and_suffix_sum(arr));
    }
}

