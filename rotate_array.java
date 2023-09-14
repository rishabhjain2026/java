import java.util.Scanner;
public class rotate_array {
    void print_array(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    void rotated(int arr[],int k,int n){
        int result[]=new int[n];
        int r=0;
        k=k%n;
        for(int i=n-k;i<n;i++){
            result[r++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            result[r++]=arr[i];
        }
        print_array(result);
//        for(int i=0;i<n;i++){
//            System.out.println(result[i]);
//        }
    }
    void rotated_2(int arr[],int k,int n){
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n);
        reverse(arr,0,n);
        print_array(arr);
    }
    void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        i++;
        j--;
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("how many times you want to rotate the array");
        int k=Sc.nextInt();
        rotate_array obj=new rotate_array();
        //obj.rotated(arr,k,n);
        obj.rotated_2(arr,k,n);
    }
}
