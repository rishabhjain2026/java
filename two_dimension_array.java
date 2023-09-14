import java.util.Scanner;
public class two_dimension_array {
    void print_array(int [][]arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void add_2_matrix(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
       // int r1,r2,c1,c2;
        int [][]arr=new int[r1][c1];
        if(r1==r2 & c1==c2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    arr[i][j]=arr1[i][j]+arr2[i][j];
                    System.out.print(arr1[i][j]+"+"+arr2[i][j]+"="+arr[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
    void multiply_2_matrix(int [][]arr1,int r1,int c1,int [][]arr2,int r2,int c2){
        int [][]arr=new int[r1][c2];
        if(c1!=r2){
            System.out.println("invalid matrix");
            return ;
        }
        else{
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        arr[i][j]=0;
                        arr[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            print_array(arr,r1,c2);
        }
    }
    void transpose(int[][]arr,int r1,int c1){
        int [][]ans=new int[r1][c1];
        System.out.println("array before transpose");
        print_array(arr,r1,c1);
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ans[j][i]=arr[i][j];
            }
        }
        System.out.println("array after transpose");
        print_array(ans,r1,c1);
    }
    void transpose_without_extra_space(int [][]arr1,int r1,int c1){
        System.out.println("array before transpose");
        print_array(arr1,r1,c1);
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
        System.out.println("array after transpose");
        print_array(arr1,r1,c1);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number of rows of first array");
        int r1=Sc.nextInt();
        System.out.println("enter number of column of first array");
        int c1=Sc.nextInt();
        System.out.println("enter the element");
        int [][]arr1=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=Sc.nextInt();
            }
        }
       // int [][]arr=new int[r1][c1];
//        System.out.println("enter number of rows of second array");
//        int r2=Sc.nextInt();
//        System.out.println("enter number of column of second array");
//        int c2=Sc.nextInt();
//        System.out.println("enter the element");
//        int [][]arr2=new int[r2][c2];
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                arr2[i][j]=Sc.nextInt();
//            }
//        }
        two_dimension_array obj=new two_dimension_array();
        //obj.print_array(arr1,r1,c1);
        //obj.add_2_matrix(arr1,r1,c1,arr2,r2,c2);
        //obj.multiply_2_matrix(arr1,r1,c1,arr2,r2,c2);
        //obj.transpose(arr1,r1,c1);
        //obj.transpose_without_extra_space(arr1,r1,c1);
    }
}
