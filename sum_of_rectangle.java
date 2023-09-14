import java.util.Scanner;

public class sum_of_rectangle {
    int[][] prefix_sum1(int [][]arr,int r,int c) {
        //int prefix[0]=arr[0];
        //int n = arr.length;
        for (int i=1; i<r; i++) {
            for(int j=1;j<c;j++)
            arr[i][j]+= arr[i][j-1];
        }
        return arr;
    }
    void sum_of_rectangle_1(int [][]arr,int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
    void sum_of_rectangle_2(int r,int c,int [][]arr,int r1,int c1,int r2,int c2){
        prefix_sum1(arr,r,c);
        int sum=0;
        for(int i=r1;i<=r2;i++){
            sum+=arr[i][c2]-arr[i][c1-1];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum_of_rectangle obj=new sum_of_rectangle();
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number of rows ");
        int r=Sc.nextInt();
        System.out.println("enter number of column ");
        int c=Sc.nextInt();
        System.out.println("enter the element");
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=Sc.nextInt();
            }
        }
        System.out.println("enter r1 of rectangle_sum");
        int r1=Sc.nextInt();
        System.out.println("enter c1 of rectangle_sum");
        int c1=Sc.nextInt();
        System.out.println("enter r2 of rectangle_sum");
        int r2=Sc.nextInt();
        System.out.println("enter c2 of rectangle_sum");
        int c2=Sc.nextInt();
        //obj.sum_of_rectangle_1(arr,r1,c1,r2,c2);
        obj.sum_of_rectangle_2(r,c,arr,r1,c1,r2,c2);
    }
}
