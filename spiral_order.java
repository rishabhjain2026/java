import java.util.Scanner;

public class spiral_order {
    void print_spiral(int arr1[][],int r1,int c1) {
        int top_row = 0, bottom_row = r1 - 1, left_column = 0, right_column = c1 - 1;
        int total_element = 0;
        while (total_element < r1 * c1) {
            for (int i = left_column; i <= right_column; i++){
                System.out.println(arr1[top_row][i]+" ");
                total_element++;
            }
            //System.out.println();
            top_row++;
            for(int i=top_row;i<=bottom_row;i++){
                System.out.println(arr1[i][right_column]+" ");
                total_element++;
            }
            //System.out.println();
            right_column--;
            for(int i=right_column;i>=left_column;i--){
                System.out.println(arr1[bottom_row][i]+" ");
                total_element++;
            }
            //System.out.println();
            bottom_row--;
            for(int i=bottom_row;i>=top_row;i--){
                System.out.println(arr1[i][left_column]+" ");
                total_element++;
            }
            //System.out.println();
            left_column++;
        }
    }
    void generate_spiral_of_square(int n){
        int r1,c1;
        r1=n;
        c1=n;
        int [][]arr1=new int[r1][c1];
        int top_row = 0, bottom_row = r1 - 1, left_column = 0, right_column = c1 - 1;
        int total_element = 0;
        int element=1;
        while (total_element < n*n) {
            for (int i = left_column; i <= right_column; i++){
                //System.out.println(element+" ");
                arr1[top_row][i]=element;
                element++;
                total_element++;
            }
            top_row++;
            for(int i=top_row;i<=bottom_row;i++){
                //System.out.println(element+" ");
                arr1[i][right_column]=element;
                element++;
                total_element++;
            }
            right_column--;
            for(int i=right_column;i>=left_column;i--){
                //System.out.println(element+" ");
                arr1[bottom_row][i]=element;
                element++;
                total_element++;
            }
            bottom_row--;
            for(int i=bottom_row;i>=top_row;i--){
                //System.out.println(element+" ");
                arr1[i][left_column]=element;
                element++;
                total_element++;
            }
            left_column++;
        }
        //print_array(arr1,r1,c1);
    }
    void print_array(int [][]arr1,int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        print_spiral(arr1,r1,c1);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int n=Sc.nextInt();
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
        spiral_order obj=new spiral_order();
        //obj.print_spiral(arr1,r1,c1);
        //obj.generate_spiral_of_square(n);
    }
}
